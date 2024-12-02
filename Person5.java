package com.encapsulations;
public class Person5 {
	private String name;
	private int age;
	private String email;
	public Person5(String name, int age, String email) {
		this.name = name;
		setAge(age);
		setEmail(email);
	}
	public void getName() {
		System.out.println("The name of the person:"+name);
	}
	public void setName(String name) {
		System.out.println("the name of the person:"+(this.name=name));
	}
	public void getAge() {
		System.out.println("The age of the person:"+age);
	}
	public void setAge(int age) {
		if(age>0 && age<120) {
			System.out.println("The age of the person:"+(this.age=age));
		}
		else {
			System.out.println("Invalid,The age should be in between 0 to 120");
		}
	}
	public void getEmail() {
		System.out.println("The email of the person:"+email);
	}
	public void setEmail(String email) {
		if(email!=null && email.contains("@") && email.contains(".")) {
			System.out.println("The email of the person:"+(this.email=email));
		}
		else {
			System.out.println("Invalid email please check once");
		}
	}
	public static void main(String[] args) {
		Person5 per=new Person5("mounika", 22, "mounika@gmail.com");
		per.getName();
		per.getAge();
		per.getEmail();
		per.setName("madhan");
		per.setAge(25);
		per.setEmail("madhan@gmail.com");

	}
	
}
