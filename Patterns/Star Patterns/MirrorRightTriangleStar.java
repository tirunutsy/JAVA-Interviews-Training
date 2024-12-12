package dailyTasks.Patterns;

import java.util.Scanner;

public class MirrorRightTriangleStar {
	
	public void printMirrorRightTriangleStar(int n) {
//		Where n = Number of Rows
//		Rows
		for(int i = 1; i <= n;i++) {
//			For Spaces
			for(int space = 1; space <= n-i; space++) {
				System.out.print(" ");
			}
//				For Columns
				for(int j = 1; j <= i; j++) { 
					System.out.print("*");
				}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MirrorRightTriangleStar pattern = new MirrorRightTriangleStar();
//		Now take input from the user
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number of Rows for Mirror Right Triangle :");
		int n = obj.nextInt();
//		Now passing User input(n) to method we created to print Pyramid
		pattern.printMirrorRightTriangleStar(n);
		
//		OUTPUT = Enter the Number of Rows for Mirror Right Triangle :
//		         7
//	                   *
//	                  **
//	                 ***
//	                ****
//	               *****
//	              ******
//               *******
		
	}

}
