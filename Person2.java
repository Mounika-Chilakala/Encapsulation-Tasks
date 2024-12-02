package com.encapsulations;

public class Person2 {
	private String name;
	private int age;
	private String email;
	public void getName() {
		System.out.println("The name of the person:"+name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void getAge() {
		System.out.println("The age of the person:"+age);
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
		else {
			System.out.println("The age cant be in negative and zero");
		}
	}
	public void getEmail() {
		System.out.println("The email of the person:"+email);
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public static void main(String[] args) {
		Person2 person=new Person2();
		person.setName("Mounika");
		person.getName();
		person.setAge(22);
		person.getAge();
		person.setEmail("mounika@gmail.com");
		person.getEmail();
	}

}
