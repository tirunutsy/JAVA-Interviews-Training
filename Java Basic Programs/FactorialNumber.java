package javaBasicPrograms;
import java.util.*;

//  Write a java program to Find Factorial  

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find its factorial :");
		int num = sc.nextInt();
		int ans = FindFactorial(num);
		System.out.println("Factorial of Number "+num+" is "+ans);
		
	}
	
	public static int FindFactorial(int n) {
		int fact=1;
		if(n <= 1) {
			return fact;
		}
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}

}

//OUTPUT 1 :
//	    Enter a Number to find its factorial :
//		5
//		Factorial of Number 5 is 120

//OUTPUT 2 :
//	    Enter a Number to find its factorial :
//		6
//		Factorial of Number 6 is 720
