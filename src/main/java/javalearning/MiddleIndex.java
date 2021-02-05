package javalearning;

public class MiddleIndex {

// Find Middle index at which sum is equal to right sum
	
	public static int searchMiddleIndex(int[] numbers) {
		
		int endindex = numbers.length-1;
		int startindex = 0;
		int sumLestSide = 0;
		int sumRightSide = 0;
		
		for(int i=0; i<numbers.length-1;i++) {
			
			sumRightSide = sumRightSide+ numbers[endindex];
			sumLestSide = sumLestSide + numbers[startindex];
			endindex--;
			startindex++;
			if(startindex > endindex) {
				if(sumLestSide == sumRightSide) {
					System.out.println(sumRightSide);
					System.out.println(sumLestSide);
					return startindex;
				} else {
					return 0;
				}
			}
			
		}
		return 0;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] num = {2,4,4,5,4,1};
		
		MiddleIndex mi = new MiddleIndex();
		int status = mi.searchMiddleIndex(num);
		if(status == 0) {
			System.out.println("Array not fit");
		}else {
			System.out.println("At Index =" +status+ "sum of right is equal to left");
		}
		
		
	}

}
