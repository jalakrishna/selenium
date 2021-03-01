package com.selenium.java8learning;

import java.util.function.Predicate;

import org.checkerframework.checker.units.qual.s;

// Predicate --> one parameter retirns boolean
// use only if you have conditional checks in your program

public class PredicatInterfaceExample {
	
	String Ename = null;
	Integer Esalary = null;
	Integer Eexp = null;
	
	
	PredicatInterfaceExample(String name, int salary, int exp){
		Ename = name;
		Esalary = salary;
		Eexp = exp;
	}
	

	public static void main(String[] args) {
		
		Predicate<Integer> prei = i->(i>10);
		Predicate<String>  pres = j->(j=="Jala");
		boolean numb = prei.test(20);
		boolean str = pres.test("Jaa");
		System.out.println(numb);
		System.out.println(str);
		Predicate<String> pr=s->(s.length()>4);
		System.out.println(pr.test("Welcome"));
		System.out.println(pr.test("xyz"));
		
		PredicatInterfaceExample pe = new PredicatInterfaceExample("Ravi",5000,3);
		
		//Predicate<PredicatInterfaceExample> pr = e()
		
		Predicate<String> strvar=d->(d.length()>4);	
		String[] names = {"vivek","sonal","jason","bal"};
		for( String name:names) {
			if(strvar.test(name)) // PredicateInterface Method
			{
			System.out.println(name);	
			}
		}
		
		System.out.println("Output : " +strvar.test(names.toString()));
		
		
		
	}

}
