package exceptionHand;

public class AnotherClass {

	public static void main(String[] args) {
		
		fun1();
		
	}
	
	static void fun1() {
		
		int a = 5;
		int b = 3;
		
		int c = a/b;
		System.out.println(c);
		
		boolean isTrue = true;
		if(isTrue) {
			throw new ArrayIndexOutOfBoundsException("Danger");
		}
		
		
	}

}
