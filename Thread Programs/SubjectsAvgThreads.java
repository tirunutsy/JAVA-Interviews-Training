package dailyTasks.Threads;

// write a Java program that calculates the average of 5 subject using threads

class SubAvg extends Thread{
	int sub1=88, sub2=76, sub3=70, sub4=90, sub5=81;
	int totalSub = 5;
	public void run() {
		int avg = (sub1+sub2+sub3+sub4+sub5)/totalSub;
		System.out.println(avg);
	}
}

public class SubjectsAvgThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubAvg avg = new SubAvg();
		System.out.println("Total Avg of Given "+avg.totalSub+" Subjects are :");
		avg.start();

	}
}

// OUTPUT : 
//	     Total Avg of Given 5 Subjects are :
//		 81