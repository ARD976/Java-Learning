package exceptionHand;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			int a = 5;
			int b = 0;
			
			int c = a/b;
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			
			System.out.println(e.getMessage()+" occured , please check.");
			
		}finally {
			System.out.println("Sorry for inconvinience.");
		}
		
		System.out.println("Important code.");
	}

}
