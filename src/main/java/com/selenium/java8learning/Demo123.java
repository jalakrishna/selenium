package com.selenium.java8learning;

@FunctionalInterface
interface car {
	
	void cartype();

}

class carclass implements car {

	@Override
	public void cartype() {
		System.out.println("This is cartype class");
		
	}
	
}


public class Demo123 {

	public static void main(String[] args) {
		car cc = new carclass();
		cc.cartype();
	}

}
