package dailyTasks;

// Write a program to copy an array by iterating the array

public class CopyArray {
	
//	Creating a Method for Copying an Array into a new Array
	public static int[] copyArray(int arr[]) {
		
		int[] copyArr = new int[arr.length];

		for(int i=0; i <= arr.length-1; i++){
		      copyArr[i] = arr[i];
		}
		return copyArr;
	}
	
//	Creating a Method to traverse and Print a Array
	public static void printArray(int[] arr) {
		System.out.println("The Copy Array is :");
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
//		Creating new integer array called newArray that stores the array given/copied by function copyArray();
		int[] newArray = copyArray(arr);
//		Now passing newArray to Print its values
		printArray(newArray);
		
//		OUTPUT = The Copy Array is :
//		         1 2 3 4 5 6 7 8 9 10 
	}

}
