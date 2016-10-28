package com.simplehrsystem;

public class Person {
	
	//properties
	protected String firstName;
	protected String lastName;
	
	//get & set methods
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//constructors
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	
	//other methods
	
	public void display() {
		System.out.println("Person Object");
		System.out.println(firstName + " " + lastName);
	}
	
	

	public static void main(String[] args) {
		
		Person person = new Person("Aidan", "Killeen");
		person.display();
		
		//person.firstName = "Fred";
		//person.display();
	}



	

}
