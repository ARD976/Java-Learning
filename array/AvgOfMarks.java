package array;

import java.util.Scanner;

public class AvgOfMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		float avg=0;
		System.out.println("Enter the number of students:");
		n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("Enter the marks of students:");
		for(int i=0;i<5;i++) {
			marks[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			avg+=marks[i];
		}
		avg/=n;
		System.out.println("Average of class is : "+avg);
		sc.close();

	}

}
