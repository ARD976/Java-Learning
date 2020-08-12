package whileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int lastDigit;
		int reverse=0;
		while(temp>0) {
			lastDigit=temp%10;
			reverse=reverse*10+lastDigit;
			temp/=10;
		}
		if(reverse==n) {
			System.out.println(n+" is a palindrome.");
		}else {
			System.out.println(n+" is a not palindrome.");
		}
		sc.close();
	}

}
