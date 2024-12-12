package dailyTasks.Patterns;

import java.util.Scanner;

public class RightTriangleStar {
	
	public void printRightTriangleStar(int n) {
//		Where n = Number of Rows
//		Rows
		for(int i = 1; i <= n;i++) {
//				For Columns
				for(int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RightTriangleStar pattern = new RightTriangleStar();
//		Now take input from the user
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number of Rows for Right Triangle Star:");
		int n = obj.nextInt();
//		Now passing User input(n) to method we created to print Right Triangle
		pattern.printRightTriangleStar(n);
		
//		OUTPUT = Enter the Number of Rows for Right Triangle Star:
//		         5
//		         * 
//		         * * 
//		         * * * 
//	             * * * * 
//		         * * * * * 		
		
	}

}
