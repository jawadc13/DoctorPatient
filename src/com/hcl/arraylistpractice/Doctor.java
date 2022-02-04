package com.hcl.arraylistpractice;

class Doctor {

	int id;
	String name;
	String specialty;
	Doctor(int id,String name,String specialty){
		this.id=id;
		this.name=name;
		this.specialty=specialty;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty =specialty;
	}

}
