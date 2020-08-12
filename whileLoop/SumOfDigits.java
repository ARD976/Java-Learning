package whileLoop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=n;
		int r;
		int sum=0;
		while(res>0) {
			r=res%10;
			sum+=r;
			res/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}
