package javalearning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DuplicateNumber {
	
	
	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		
		for(int i=0; i<6;i++) {
			number.add(i);
		}
		number.add(3);
		 double[] mydoubleList = {2.2,1.2,3.3,5.4,4.6};
		 int[] myIntList = {3,6,7,3,8};
		 Integer[] myIntegerslist = {5,6,8,3,11};
		 String[] mynameslist = {"Jason","paul","Jim"};

		DuplicateNumber dp = new DuplicateNumber();
		dp.findDuplicateNumber(number);
	}

	private void findDuplicateNumber(List<Integer> number) {
		int n = number.size()-1;
		int dup= n * (n+1)/2;
		System.out.println("DUP  " +dup);
		int total = 0;
		for(int numb : number) {
			total = total + numb;
		}
		
		int duplicate = dup - total;
		
		System.out.println(duplicate);

		
	}

}
