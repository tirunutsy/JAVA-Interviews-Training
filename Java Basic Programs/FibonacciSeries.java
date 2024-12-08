package javaBasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
//	Here n = range of max fibonacci number
	public void FindFib(int n) {
		int a=0, b =1;
		System.out.print(a+" "+b);
		
		int i=1;
		while(i <= n) {
//			Since We have already Printed Default fibonacci numbers 0 and 1 Now we can just start with 1 (or) i as 0+1=1 
			System.out.print(" "+i);
//			Now we are swapping the Values : Now A becomes B(a=b), i(Current Value) becomes B(b=i) And Then i stores both these two numbers(A & B) as new Fibonacci Number and Prints it in the next loop 
			a = b;
			b = i;
			i = a+b;
		}
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner user = new Scanner(System.in);
	System.out.println("Enter Max Range of Fibonacci Number : ");
	int input = user.nextInt();
	FibonacciSeries fib = new FibonacciSeries();
	System.out.println("The Fibonacci Numbers Until "+input+" Are :");
	fib.FindFib(input);
	
//	OUTPUT = Enter Max Range of Fibonacci Number : 
//	         200
//	         The Fibonacci Numbers Until 200 Are : 
//	         0 1 1 2 3 5 8 13 21 34 55 89 144

}
}