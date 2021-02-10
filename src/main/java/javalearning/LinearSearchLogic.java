package javalearning;

public class LinearSearchLogic {
	
	int[] arraylist = {2,1,7,4,8,23,54,27};
	int searchnumber = 23;


	public static void main(String[] args) {

	
	}
		
		
		
		public int linearSearch(int[] arraylist, int searchnumber) {		
			for(int i=0; i<arraylist.length; i++) {
				
				if(arraylist[i] == searchnumber) {
					return i;
				}
					return -1;
		}
			return searchnumber;
			
		}
	
}
