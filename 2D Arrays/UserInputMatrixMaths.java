package dailyTasks.Matrix;
import java.util.Scanner;

// Write a Java program to create two 2D Arrays and Print them, Then Perform Addition, subtraction and multiplication programs between them(two 2D arrays)

public class UserInputMatrixMaths {
//	Creating a scanner var in order to use it every where in the class
	public static Scanner sc = new Scanner(System.in);
	
//	Method to create Matrix
	public int[][] CreateMatrix(int rows, int cols){
				
//		Assigning the matrix with user input sizes(rows/cols)
		int[][] matrix = new int[rows][cols];

//		now looping in order to take all the elements of the array from User
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.println("Enter 2D Array ["+i+"] & ["+j+"]'th Number :");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
//	Create a Method for printing the 2D Array
	public void PrintMatrix(int[][] matrix, int rows, int cols) {
		
		for(int i = 0; i<rows; i++) {
			System.out.print("[");
			for(int j = 0; j<cols; j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.print(" ]");
			System.out.println();
		}
	}
	
//	Method to do Addition between two 2D Arrays
	public int[][] MatricesAddition(int[][] a, int[][] b, int rows, int cols){
		
//		Create matrix to store both a and b added values
		int[][] addMatrix = new int[rows][cols];

		for(int i=0; i<rows; i++) { //Rows
			for(int j=0; j<cols; j++) {//cols
//				Adding both a & b 2D arrays i'th row and j'th column numbers and storing them in newly created addMatrix
				addMatrix[i][j] = a[i][j]+b[i][j];
			}
		}
		return addMatrix;
	}
	
//	Method to do Subtraction between two 2D Arrays
	public int[][] MatricesSubtraction(int[][] a, int[][] b, int rows, int cols){
		
//		Create matrix to store both a and b subtracted values
		int[][] subMatrix = new int[rows][cols];

		for(int i=0; i<rows; i++) { //Rows
			for(int j=0; j<cols; j++) {//cols
//				Subtracting both a & b 2D arrays i'th row and j'th column numbers and storing them in newly created addMatrix
				subMatrix[i][j] = a[i][j]-b[i][j];
			}
		}
		return subMatrix;
	}
	
//	Method to do Multiplication between two 2D Arrays
	public int[][] MatricesMultiplication(int[][] a, int[][] b, int rows, int cols){
		
//		Create matrix to store both a and b added values
		int[][] mulMatrix = new int[rows][cols];

		for(int i=0; i<rows; i++) { //Rows
			for(int j=0; j<cols; j++) {//cols
//				assigning MulMatrix to '0' after it stores previous 2D array multiplication values, It is to avoid it getting stored each and every element of array
				for(int k=0; k<cols; k++) {
//					So that it multiplies rows(i) elements with col(j) elements 
//					Here we used K var to travel into each row and each col correctly
					mulMatrix[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return mulMatrix;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Creating a class reference obj/variable for Dynamic Usage
		UserInputMatrixMaths obj = new UserInputMatrixMaths();
//		Taking Number of Rows and columns from the User
		System.out.println("Enter the Number of Rows for Matrices :");
		int rows = sc.nextInt();
		System.out.println("Enter the Number of Columns for matrices :");
		int cols = sc.nextInt();
		
//		Applying/Calling CrateMatrix method two times and storing the matrices in a & b  
		System.out.println("Enter First Matrix Elements");
		int[][] a = obj.CreateMatrix(rows, cols);
//		Since we have two same arrays with sizes
		System.out.println("Enter Second Matrix Elements");
		int[][] b = obj.CreateMatrix(rows, cols);
		
//		Printing Those matrices using Print method
		System.out.println("First Matrix A:");
		obj.PrintMatrix(a, rows, cols);
		System.out.println();//breaking a line
		System.out.println("Second Matrix B:");
		obj.PrintMatrix(b, rows, cols);
		System.out.println();

//		Doing addition A & B matrices and printing it using Addition and print Methods 
		System.out.println("Addition Of Matrices A and B are :");
		int[][] AddMatrix = obj.MatricesAddition(a, b, rows, cols);
		obj.PrintMatrix(AddMatrix, rows, cols);
		System.out.println();//break line
		
//		Subtracting A & B matrices and printing it using Subtraction and print Methods 
		System.out.println("Subtraction of Matrices A and B are :");
		int[][] SubMatrix = obj.MatricesSubtraction(a, b, rows, cols);
		obj.PrintMatrix(SubMatrix, rows, cols);
		System.out.println();//break line
		
//		Multiplying A & B matrices and printing it using Multiplication and Print Methods 
		System.out.println("Multiplication of Matrices A and B are :");
		int[][] MulMatrix = obj.MatricesMultiplication(a, b, rows, cols);
		obj.PrintMatrix(MulMatrix, rows, cols);
		System.out.println();//break line
		
	}

}

//OUTPUT :
//Enter the Number of Rows for Matrices :
//3
//Enter the Number of Columns for matrices :
//3
//Enter First Matrix Elements
//Enter 2D Array [0] & [0]'th Number :
//1
//Enter 2D Array [0] & [1]'th Number :
//2
//Enter 2D Array [0] & [2]'th Number :
//3
//Enter 2D Array [1] & [0]'th Number :
//4
//Enter 2D Array [1] & [1]'th Number :
//5
//Enter 2D Array [1] & [2]'th Number :
//6
//Enter 2D Array [2] & [0]'th Number :
//7
//Enter 2D Array [2] & [1]'th Number :
//8
//Enter 2D Array [2] & [2]'th Number :
//9
//Enter Second Matrix Elements
//Enter 2D Array [0] & [0]'th Number :
//5
//Enter 2D Array [0] & [1]'th Number :
//4
//Enter 2D Array [0] & [2]'th Number :
//3
//Enter 2D Array [1] & [0]'th Number :
//2
//Enter 2D Array [1] & [1]'th Number :
//1
//Enter 2D Array [1] & [2]'th Number :
//6
//Enter 2D Array [2] & [0]'th Number :
//7
//Enter 2D Array [2] & [1]'th Number :
//4
//Enter 2D Array [2] & [2]'th Number :
//3
//First Matrix A:
//[ 1 2 3 ]
//[ 4 5 6 ]
//[ 7 8 9 ]
//
//Second Matrix B:
//[ 5 4 3 ]
//[ 2 1 6 ]
//[ 7 4 3 ]
//
//Addition Of Matrices A and B are :
//[ 6 6 6 ]
//[ 6 6 12 ]
//[ 14 12 12 ]
//
//Subtraction of Matrices A and B are :
//[ -4 -2 0 ]
//[ 2 4 0 ]
//[ 0 4 6 ]
//
//Multiplication of Matrices A and B are :
//[ 30 18 24 ]
//[ 72 45 60 ]
//[ 114 72 96 ]
