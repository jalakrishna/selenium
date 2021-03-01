package com.selenium.java8learning;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo1 {
	
	String ename;
	Integer esal;
	Integer eexp;
	
@FunctionalInterface	
interface Employee{
	
	public String EmployeeData();
}




	
	FunctionalInterfaceDemo1(String name, int sal, int exp) 
	{
		ename = name;
		esal = sal;
		eexp = exp;	
	}
	
	



	public static void main(String[] args) {
		
		//Example 1
		FunctionalInterfaceDemo1 fd1 = new FunctionalInterfaceDemo1("Jala", 50000, 5);
		Predicate<FunctionalInterfaceDemo1> ef = s->(s.esal >20000 && s.eexp > 3);
		System.out.println(ef.test(fd1));
		
		
		//Example 2 Multiple data
		ArrayList<FunctionalInterfaceDemo1> al = new ArrayList<FunctionalInterfaceDemo1>();
		al.add(new FunctionalInterfaceDemo1("Bob", 60000, 6));
		al.add(new FunctionalInterfaceDemo1("Robert", 10000, 2));
		al.add(new FunctionalInterfaceDemo1("Steve", 70000, 7));
		Predicate<FunctionalInterfaceDemo1> ld = l->(l.esal >30000 && l.eexp >2);
		
		for( FunctionalInterfaceDemo1 e:al) {
			if(ef.test(e)) {
				System.out.println("Example2:  " +e.ename +"  "+ +e.eexp);
			}
		}
		
		
	}

}
