package com.hcl.arraylistpractice;

class Patient {

	int id;
	String name;
	int age;
	Patient(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
