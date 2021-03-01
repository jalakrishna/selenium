package com.selenium.java8learning;

@FunctionalInterface
interface Cab{
	
	public String bookCab(String source, String destination);

}


/*class Uber implements Cab
{

	@Override
	public void bookCab() {
		System.out.println("Uber Cab is boked Successfully...");
		
	}
	
		@Override
	public String bookCab(String source, String destination) {
		System.out.println("Uber Cab is boked Successfully...");
		return source+destination;
		
	}
	
} */


public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		//Cab ub = new Uber();
		Cab ub = (source,destination)->{System.out.println("Uber Cab is booked ....from "+source +" To " +destination);
		return ("Journey Completed");
	};
	String var = ub.bookCab("Austin","Houston");
	System.out.println(var);
	System.out.println(ub.bookCab("San Antonio","Texas"));
}
}
