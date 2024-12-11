package dailyTasks;

//Write a Java program to print 20 to 1 in reverse order using array

public class PrintArrayInReverse {
	
	public static void printArrayBackwards(int[] arr) {

		System.out.println("Given Array in Reverse Order :");
		for(int i=arr.length-1; i >= 0; i--){
		      System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		printArrayBackwards(arr);
		
//		OUTPUT : Given Array in Reverse Order :
//				 20
//				 19
//				 18
//				 17
//				 16
//				 15
//		         14
//				 13
//				 12
//				 11
//				 10
//				 9
//				 8
//				 7
//				 6
//				 5
//				 4
//				 3
//				 2
//				 1

	}

}
