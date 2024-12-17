package dailyTasks.Threads;
//
// Write a program to create 2 threads and print even and odd number from 1 to 20

class Even extends Thread{
	
	public void run() {
	
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(); //break line
	}
}
class Odd extends Thread{
	
	public void run() {
		
		for(int i=1; i<=20; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println(); //break line	
	}
}

public class MultiThreadingEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Even even = new Even();
		Odd odd = new Odd();
//		Now Passing both Threads to class obj to Start/Execute
		System.out.println("Even & Odd Numbers from 1 to 20 are :");
		even.start();
		System.out.println(); //break line
		odd.start();
		
	}
}

//OUTPUT :(Since its Threads we cant be sure of Orders unless we set priorities)
//	    Even & Odd Numbers from 1 to 20 are :
//
//		1 3 5 7 9 11 13 15 17 19 
//		2 4 6 8 10 12 14 16 18 20 

