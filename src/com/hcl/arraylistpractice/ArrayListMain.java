package com.hcl.arraylistpractice;
import java.util.*;
public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer, String, Integer> patientTest = new LinkedList<Integer, String, Integer>();
		List<Patient> patient = new LinkedList<Patient>();
		List<Doctor> doctor = new LinkedList<Doctor>();
		
		patient.add(new Patient(1,"Tom Stanton",26));
		doctor.add(new Doctor(1,"Bill Doc","Heart"));
		patient.add(new Patient(2,"Sam Cake",65));
		doctor.add(new Doctor(2,"Jeremy Clarkson","ER"));
		patient.add(new Patient(3,"Kelly Clam",24));
		doctor.add(new Doctor(3,"Sandra Vettal","Sports Medicine"));
		patient.add(new Patient(4,"Billie Jean",16));
		doctor.add(new Doctor(4,"Alex Jobe","VR Health"));
		patient.add(new Patient(5,"Cameron Chase",21));
		doctor.add(new Doctor(5,"Fatima Carrera","Surgeon"));
		
		
		
		//Sort By name
		System.out.println("Sort by Name:");
		System.out.println("Patient:");
		
		Comparator<Patient> cm1 = Comparator.comparing(Patient::getName, Comparator.nullsFirst(String::compareTo));
		Collections.sort(patient, cm1);
		for (Patient st : patient) {
			System.out.println(st.id + " " + st.name + " " + st.age);
		}
		
		System.out.println("Doctor:");
		
		Comparator<Doctor> cm2 = Comparator.comparing(Doctor::getName, Comparator.nullsFirst(String::compareTo));
		Collections.sort(doctor, cm2);
		for (Doctor st : doctor) {
			System.out.println(st.id + " " + st.name + " " + st.specialty);
		}
			
		
		
		//Sort By ID
		
		System.out.println("Sort by ID:");
		System.out.println("Patient:");
		
		Comparator<Patient> cm3 = Comparator.comparing(Patient::getID, Comparator.nullsFirst(Integer::compareTo));
		Collections.sort(patient, cm3);
		for (Patient st : patient) {
			System.out.println(st.id + " " + st.name + " " + st.age);
		}
		
		System.out.println("Doctor:");
		
		Comparator<Doctor> cm4 = Comparator.comparing(Doctor::getID, Comparator.nullsFirst(Integer::compareTo));
		Collections.sort(doctor, cm4);
		for (Doctor st : doctor) {
			System.out.println(st.id + " " + st.name + " " + st.specialty);
		}
		
		
		
		//Sort By Patient Age
		System.out.println("Sort by Patient Age:");
		
		
		Comparator<Patient> cm5 = Comparator.comparing(Patient::getAge, Comparator.nullsFirst(Integer::compareTo));
		Collections.sort(patient, cm5);
		for (Patient st : patient) {
			System.out.println(st.id + " " + st.name + " " + st.age);
		}
		
		//Sort by Doctor Specialty
		System.out.println("Sort by Doctor Specialty:");
		
		Comparator<Doctor> cm6 = Comparator.comparing(Doctor::getSpecialty, Comparator.nullsFirst(String::compareTo));
		Collections.sort(doctor, cm6);
		for (Doctor st : doctor) {
			System.out.println(st.id + " " + st.name + " " + st.specialty);
		}
	}

}
