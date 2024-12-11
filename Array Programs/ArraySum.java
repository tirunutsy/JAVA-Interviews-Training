package dailyTasks;

public class ArraySum {
	
	public static void sumArray(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++){
//			If the array has only one element
			if(arr.length == 1) {
				sum = arr[0];
				System.out.println("The Array has only One Element "+sum);
				break;
			}
			sum += arr[i];
		}
		System.out.println("The total Sum of the Array is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {11,12,13,14,15};
		sumArray(arr);
		
//		OUTPUT : The total Sum of the Array is 65
	}

}
