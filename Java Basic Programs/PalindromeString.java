package javaBasicPrograms;
import java.util.*;

// Write a Java Program to print if the Given String is Palindrome or Not

public class PalindromeString {

	public static void isPalindromeString(String input) {
//	Find the length of input String
		int n = input.length();
		String rev = "";
		
		for(int i=n-1; i>=0; i--) {
			rev += input.charAt(i);
		}
//		Check if both are same
		if(input.equals(rev)) {
			System.out.println("Yup, The Given String "+input+" is a Palindrome");
		}
		else
			System.out.println("Oops, The Given String "+input+" is Not a Palindrome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A Word to check if its palindrome :");
		String input = obj.nextLine();
		isPalindromeString(input);
	}

}
