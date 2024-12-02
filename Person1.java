package com.encapsulations;

public class Person1 {
	private String name;
	private int age;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
		else {
			System.out.println("The age cant be in negative and zero");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email=email;
	}

}
