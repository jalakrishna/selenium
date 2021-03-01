package com.selenium.java8learning;

public interface Interfaceslearningjava7 {
	
	//Rule: Functional interface should have one Abstarct method and n number of Static & Default  methods
	//Rule: Non Functional interface : multiple Abstarct method and n number of Static & Default  methods
	
	// Functional interfaces in Java
	// --> 1 ) Runnable (Interface) --> Run() Method
	// --> 2) Callable --> call() method
	// --> 3) Comparable --> CompareTo() Method
	// --> 4) Actionalistner --> actionperformer()
	
	// Note: Lambda expressions can only be invoked through functional interfaces
	
	// From Java 8 we have 4 pre-defined Functional Interfaces (Below listed ones)
		// 1. Predicate
		// 2. Function
		// 3. Consumer
		// 4. Supplier
		// Package java.util.package
	
	
	//Abstract methods
	public void m1();
	
	public String m2();
	
	//Static methods
	
	public static String m3() {
		return null;
		
	}
	
	//Default methods
	public default void m4() {
		
	}
	
	

}
