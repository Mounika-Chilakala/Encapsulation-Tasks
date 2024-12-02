package com.encapsulations;

public class Person3 {
	private String name;
	private int age;
	private String email;
	public Person3(String name, int age, String email) {
		super();
		this.name = name;
		if(age>0) {
			this.age=age;
		}
		else {
			System.out.println("The age cant be in nagetive and zero");
		}
		this.email = email;
	}
	public void getName() {
		System.out.println("The name of the person:"+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getAge() {
		System.out.println("The age of the person:"+age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getEmail() {
		System.out.println("The email of the person:"+email);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static void main(String[] args) {
		Person3 person=new Person3("Mounika", 22, "mouni@gmail.com");
		person.getName();
		person.getAge();
		person.getEmail();
		person.setName("Madhan");
		person.setAge(25);
		person.setEmail("madhan@gmail.com");
		person.getName();
		person.getAge();
		person.getEmail();
	}
	

}
