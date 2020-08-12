package forLoop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==1 || n==2) {
			System.out.println("Given number is prime.");
		}
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				
				System.out.println("Given number is not prime.");
				break;
				
			}else {
				if(i==(n-1)) {
					if(n%(n-1)!=0) {
						System.out.println("Given number is prime.");
						break;
					}
					
				}
				continue;
				
			}
			
		}
		sc.close();
	}

}
