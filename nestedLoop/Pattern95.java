package nestedLoop;

import java.util.Scanner;

public class Pattern95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=n-1;
		int sum1=n;
		
		for(int i=1,l=0;i<=n;i++,l++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==i) {
					System.out.print(0+" ");
				}else if(j<i){
					sum+=1;
					System.out.print(sum+" ");
				}else {
					sum1-=1;
					System.out.print(sum1+" ");
				}
			}
			sum=sum-l-1;
			sum1=n;
			System.out.println();
		}
		sc.close();
	}

}
