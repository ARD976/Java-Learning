package array;

import java.util.Scanner;

public class SumOfTwoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns:");
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		System.out.println("Enter the elements of first matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of given matrices:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
