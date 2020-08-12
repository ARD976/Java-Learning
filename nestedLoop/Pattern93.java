package nestedLoop;

import java.util.Scanner;

public class Pattern93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				sum+=1;
				System.out.print(sum+" ");
			}
			sum=0;
			System.out.println();
		}
		sc.close();
	}

}
