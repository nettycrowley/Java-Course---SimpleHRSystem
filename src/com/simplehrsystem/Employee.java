package com.simplehrsystem;

public class Employee extends Person {
	
	//Properties
	private double salary;
	
	//get & set methods
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//constructor(s)
	public Employee(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
	}
	
	//other methods
	public void display(){
		System.out.println("Employee Object");
		super.display(); //this calls the person display method
		System.out.println(salary);
	}
	
	//main test
	public static void main(String[] args) {

		Employee employee = new Employee("Aidan", "LastName", 30000);
		employee.display();

	}

}
