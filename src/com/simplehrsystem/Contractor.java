package com.simplehrsystem;

public class Contractor extends Person {
	
	//properties
	protected double dailyRate;
	
	
	//get & set methods
	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}
	
		
	//Constructor(s)
	
	public Contractor(String firstName, String lastName, double dailyRate) {
		super(firstName, lastName);
		this.dailyRate = dailyRate;
	}

	
	//Other Methods
	public void display(){
		System.out.println("Contractor Object");
		super.display();
		System.out.println(dailyRate);
	}

	public static void main(String[] args) {

		Contractor contractor = new Contractor("Fred", "Flinstone", 250);
		contractor.display();
		
		//Contractor[] list = new Contractor[10];
		//list[0] = new Contractor ("Barney", "Rubble", 100);

	}




}
