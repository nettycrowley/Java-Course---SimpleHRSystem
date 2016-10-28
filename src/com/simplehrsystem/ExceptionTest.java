package com.simplehrsystem;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try{
			int r = (int)(Math.random()*3);
			
			if (r==0){
				String string = null;
				System.out.println(string.toUpperCase());
			}
			
			if (r==1){
				int[] list = {1,2,3,4,5};
				
				for (int i=1; 1<=5; i++) {
					System.out.println(list[i]);
				}
			}
			
			if (r==2){
				int x = 10;
				int y = 0;
				
				int answer = x/y;
				
				System.out.println(answer);
			}
		}catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("something went wrong with the array");
			//ex.printStackTrace();
			StackTraceElement[] stackTraceElements = ex.getStackTrace();
			for (StackTraceElement e : stackTraceElements){
				System.out.println("Line number:" + e.getLineNumber());
			}
		}catch (ArithmeticException ex){
			System.out.println("something went wrong with the math");
		}catch (NullPointerException ex){
			System.out.println("You have a null pointer");
		}catch (Exception ex){
			System.out.println("something happened, oh dear");
		}
		
		System.out.println("Program finished normally");
		
		try{
			Thread.sleep(5000);	
		} catch (InterruptedException e) {
			
		}
		System.out.println("finished");
	}
}


