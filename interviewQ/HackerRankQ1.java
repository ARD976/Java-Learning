package interviewQ;

import java.util.Scanner;

public class HackerRankQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long sum1 = candy(n , a);
		System.out.println(sum1);
		
		

	}
	
	static long candy(int n , int a[]) {
		int[] c = new int[n];
		
		for(int i=0;i<n;i++) {
			c[i]=1;
		}
		
		for(int i=1;i<n;i++) {
			if(a[i]>a[i-1]) {
				c[i]=c[i-1]+1;
			}
		}
		
		for(int i=n-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				c[i]=Math.max(c[i+1]+1 , c[i] );
			}
		}
		
		long sum = 0;
		
		for(int i=0;i<n;i++) {
			sum+=c[i];
		}
		
		return sum;
	}

}
