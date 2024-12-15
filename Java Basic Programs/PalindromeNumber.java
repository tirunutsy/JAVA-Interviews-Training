package javaBasicPrograms;
import java.util.*;

// Write a java Program to check if the Given number is palindrome or Not

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number to check if its Palindrome :");
		int input = obj.nextInt();
		isPalindromeNumber(input);
	}
	
	public static void isPalindromeNumber(int n) {
//		Converting the User input Integer into Sting
		String nString = String.valueOf(n);
		int length = nString.length();
		String reverse = "";
		
		for(int i=length-1; i >= 0; i--) {
			reverse += nString.charAt(i);
		}
		
		if(nString.equals(reverse)) {
			System.out.println("Yup, The Given Number "+nString+" is a Palindrome");
		}
		else
			System.out.println("Oops, The Given Number "+nString+" is Not a Palindrome");
		
	}

}
