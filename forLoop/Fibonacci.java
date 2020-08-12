package forLoop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=1;i<=n-2;i++) {
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		sc.close();
	}

}
