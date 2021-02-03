package javalearning;

public class reverseNumber {

	public int reverseNumber(int number) {
		
		int reverse = 0;
		while(number !=0) {
			
			reverse = (reverse * 10) + (number % 10);
			number = number/10;
		}
		
		return reverse;
	}
	
	
	public static void main(String[] args) {
		
		reverseNumber rn = new reverseNumber();
		System.out.println(rn.reverseNumber(54567));
		
		
	}

}
