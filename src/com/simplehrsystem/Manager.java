package com.simplehrsystem;

public class Manager extends Employee {
	
	//properties
	protected int directReports;
	
	//get & set methods
	public int getDirectReports() {
		return directReports;
	}

	public void setDirectReports(int directReports) {
		
		this.directReports = directReports;
	}
	
	//Constructor(s)

	public Manager(String firstName, String lastName, double salary, int directReports) {
		super(firstName, lastName, salary);
		this.directReports = directReports;
	}
	
	//other methods
	public void display(){
		System.out.println("Manager Object");
		super.display();
		System.out.println("Direct Reports:" + directReports);
		System.out.println();
		
	}

	public static void main(String[] args) {
		Manager manager = new Manager("Aidan", "Killeen", 45000, 10);
		//manager.display();
		
		Contractor contractor = new Contractor("Fred", "Flinstone", 250);
		//contractor.display();
		
		Employee employee = new Employee("Barney", "Rubble", 30000);
		//employee.display();
		
		Person[] personList = new Person[3];
		personList[0] = manager;
		personList[1] = contractor;
		personList[2] = employee;
		
		for (int i=0; i<personList.length; i++){
			personList[i].display();
		}
		
		for (Person p : personList){
			p.display();
		}
		
	}



}
