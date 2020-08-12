package oops;
import oops.MainClass.*;

public class Introduction {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int result = maxOf(a,b);
		System.out.println(result);
		
		MainClass m = new MainClass();

	}
	static int maxOf(int c , int d) {
		int res=(c>d)?c : d;
		return res;
	}
	

}
