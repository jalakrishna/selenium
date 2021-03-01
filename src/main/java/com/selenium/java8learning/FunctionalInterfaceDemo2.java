package com.selenium.java8learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalInterfaceDemo2 {

public static void main(String[] args) {

	Predicate<String> str = i->(i == "Jala");
	Predicate<Integer> prei = i->(i>10);
	Predicate<Long> lng = i->(i == 2.5);
	Predicate<Character> chr = i->(i == 'K');
	boolean result = chr.test('K');
	
	int[] a = {5,15,20,25,30,35,40,45,50,55,60,65};
	List<Integer> values = Arrays.asList(4,5,6,7,8);
	List<String> vals = Arrays.asList("Jala","John","Melinda");
	
	//External for loop
	
	//Internal for loop Java8
	values.forEach(i -> System.out.println(i));
	Predicate<Integer> p1 = i-> i%2==0;
	Predicate<Integer> p2 = i-> i>50;
	
	for(int n:a) {
		if(p1.and(p2).test(n)) {
			System.out.println(n);
		}
		
	}
	
	for(int n:a) {
		if(p1.or(p2).test(n)) {
			System.out.println(n);
		}
		
	}
	
	for(int n:a) {
		if(p1.negate().test(n)) { // Nagate prints Odd Numbers
			System.out.println(n);
		}
		
	}
 

	}	





}
