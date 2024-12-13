package dailyTasks.Matrix;
import java.util.*;

// Write a java program to take 2D Array from user input and Print it

public class UserInputMatrix2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Taking Number of Rows and columns from the User
		System.out.println("Enter the Number of Rows :");
		int rows = sc.nextInt();
		System.out.println("Enter the Number of Columns :");
		int cols = sc.nextInt();
//		Assign those value as size or arrays
		int[][] a = new int[rows][cols];
//		int[][] b = new int[rows][cols];
		
//		now looping in order to take all the elements of the array from User
//		Taking inputs of Array A
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.println("Enter 2D Array of A ["+i+"] & ["+j+"]'th Number :");
				a[i][j] = sc.nextInt();
			}
		}
		
//		Now printing the 2D Array of A
		for(int i = 0; i<rows; i++) {
			System.out.print("[");
			for(int j = 0; j<cols; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.print(" ]");
			System.out.println();
		}
		
	}

}

//OUTPUT 1 :
//Enter the Number of Rows :
//3
//Enter the Number of Columns :
//3
//Enter 2D Array of A [0] & [0]'th Number :
//1
//Enter 2D Array of A [0] & [1]'th Number :
//2
//Enter 2D Array of A [0] & [2]'th Number :
//3
//Enter 2D Array of A [1] & [0]'th Number :
//4
//Enter 2D Array of A [1] & [1]'th Number :
//5
//Enter 2D Array of A [1] & [2]'th Number :
//6
//Enter 2D Array of A [2] & [0]'th Number :
//7
//Enter 2D Array of A [2] & [1]'th Number :
//8
//Enter 2D Array of A [2] & [2]'th Number :
//9
//[ 1 2 3 ]
//[ 4 5 6 ]
//[ 7 8 9 ]


//OUTPUT 2:
//Enter the Number of Rows :
//3
//Enter the Number of Columns :
//2
//Enter 2D Array of A [0] & [0]'th Number :
//1
//Enter 2D Array of A [0] & [1]'th Number :
//2
//Enter 2D Array of A [1] & [0]'th Number :
//3
//Enter 2D Array of A [1] & [1]'th Number :
//4
//Enter 2D Array of A [2] & [0]'th Number :
//5
//Enter 2D Array of A [2] & [1]'th Number :
//6
//[ 1 2 ]
//[ 3 4 ]
//[ 5 6 ]
