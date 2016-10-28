package com.simplehrsystem;

public class TestClass {
	
	//properties
	protected int x;
	protected int y;
	
	//get & set methods
	
	//constructor
	public TestClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//other methods
	
	@Override
	public String toString() {
		return "TestClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClass other = (TestClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		TestClass o1 = new TestClass(1,1);
		//TestClass o2 = o1;
		TestClass o2 = new TestClass(1,1);
		
		if (o1.equals(o2)){
			System.out.println("the same");
		} else {
			System.out.println("different");				
		}
		
		String s1 = new String("Aidan");
		
		String s2 = new String("Aidan");
		
		if (s1 == s2){
			System.out.println("strings are the same");
		} else {
			System.out.println("strings are different");
		}
		
		if (s1.equals(s2)) {
			System.out.println("strings are the same");
		} else {
			System.out.println("strings are different");
		
		}
		/*
		TestClass o3;
		try {
		o3 = (TestClass) o1.clone();
		System.out.println(o3);
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		*/
	}

}
