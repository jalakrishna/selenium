package javalearning;

public class StringRecursiveReversal {
	
	String reverse = "";
	
	String rev = "";
	
	
	public String reverseString_1(String str) {
		System.out.println(str.length());
		
		int length = str.length();
		while(length != 0) {
			this.reverse = reverse + str.charAt(length-1);
			length = length-1;
		}		
		return reverse;
	}
	
	
	public String reverseString_3(String str) {
		System.out.println(this.rev);
		
		if(str.length() == 1) {
			return str;
		}else {
			rev = rev + str.charAt(str.length()-1) + reverseString_3(str.substring(0, str.length()-1));
			return rev;
		}
		
	}
	
	public String reverseString_4(String str) {
		String reverse = "";
		for(int i=str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);	
		}
		
		return reverse;
	}
	
	
	/*public String reverseString_2(String str) {
		
		reverse = reverse + str.charAt(str.length()-1);
		str = str.substring(0, str.length()-1);
		reverseString_2(str);
		return reverse;
	
	} */
	
	
	
	
	
	public static void main(String[] args) {
		
		StringRecursiveReversal str = new StringRecursiveReversal();
		System.out.println(str.reverseString_1("jala krishna"));
		//System.out.println(str.reverseString_2("jala krishna"));
		System.out.println(str.reverseString_3("jala krishna"));
		System.out.println(str.reverseString_4("Hello"));
	
	}

}
