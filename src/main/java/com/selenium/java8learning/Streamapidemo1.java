package com.selenium.java8learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streamapidemo1 {
	
	int id;
	String name;
	int price;
	
	Streamapidemo1(int id, String name, int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(55);
		al.add(30);
			
		al.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::print);
		
		List<String> names = Arrays.asList("Jala","Mohan","Krishna");
		names.stream().filter(n->n.length()>4 && n.length()<=5).collect(Collectors.toList()).forEach(System.out::print);
		
		List<Streamapidemo1> sd = Arrays.asList(new Streamapidemo1(1, "HP", 10000),new Streamapidemo1(2, "Sony", 25000), new Streamapidemo1(3, "Apple", 50000));
		sd.stream().filter(pc->pc.price>25000).collect(Collectors.toList()).forEach(pc->System.out.println(pc.price));
		
		List<String> name = Arrays.asList("chennai","madras","banglore","andhra");
		name.stream().map(n->n.toUpperCase()).collect(Collectors.toList()).forEach(s->System.out.println("Place: " +s));
		name.stream().forEach(n->System.out.println(n.toUpperCase()));
		
		List<Integer> lst1 = Arrays.asList(2,3);
		List<String> lst2 = Arrays.asList("pavan","rahul");
		List<Integer> lst3 = Arrays.asList(4,5);
		List<String> lst4 = Arrays.asList("Huston","Dallas");
		List<List<? extends Object>> totallst = Arrays.asList(lst1,lst2,lst3,lst4);
		List<List<Integer>> totalnumblst = Arrays.asList(lst1,lst3);
		
		
		//Flat map Example
		List<Integer> vals = totalnumblst.stream().flatMap(x->x.stream()).collect(Collectors.toList());;
		System.out.println(vals);
		List<Integer> vals1 = totalnumblst.stream().flatMap(x->x.stream()).map(y->y+10).collect(Collectors.toList());
		System.out.println(vals1);

		
		 
		
	}

}
