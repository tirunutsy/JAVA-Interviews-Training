package javaBasicPrograms;
import java.util.*;

//  Write a Java Program to find if its Armstrong Number 

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A Number to find if its Armstrong Number :");
		int input = obj.nextInt();
		findIfArmstrong(input);
		
	}
	
	public static void findIfArmstrong(int input) {
//	 Create duplicate input num for further changes and modifications
		int tempNum = input;
//		Find the length of the User input number by converting to string
		String sNum = String.valueOf(input);
		int digits = sNum.length();
		int lastDigit, totalSum=0;
		
//		Loop till digits
		for(int i=1; i<=digits; i++) {
			
			lastDigit = tempNum%10; //Gives last Digit
			tempNum = tempNum/10; //Giver gives reminder except last digit
			totalSum += Math.pow(lastDigit, digits); //i,e last digit power(^) total digits	
		}
		if(input == totalSum) {
			System.out.println("Hurray! The Given Number "+input+" is Armstrong Number");
		}
		else System.out.println("Oops! The Given Number "+input+" is Not Armstrong Number");
	}

}

//OUTPUT 1:
//        Enter A Number to find if its Armstrong Number :
//        93084
//        Hurray! The Given Number 93084 is Armstrong Number
//

//OUTPUT 2:
//	      Enter A Number to find if its Armstrong Number :
//		  1234
//		  Oops! The Given Number 1234 is Not Armstrong Number

//OUTPUT 3:
//        Enter A Number to find if its Armstrong Number :
//        153
//        Hurray! The Given Number 153 is Armstrong Number