package dailyTasks;

public class AverageOfArray {
	
	public static void arrayAvg(int[] arr) {
			
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++){
	//		If the array has only one element
			if(arr.length == 1) {
				sum = arr[0];
				System.out.println("Array's only Element is "+sum);
				break;
			}
			sum += arr[i];
		}
		System.out.println("The Average of the Array is "+sum/arr.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,12,13,14,15};
		arrayAvg(arr);
		
//		OUTPUT : The Average of the Array is 13
	}

}
