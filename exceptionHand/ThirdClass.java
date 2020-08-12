package exceptionHand;

public class ThirdClass {

	public static void main(String[] args)  {
		fun1();
	}
	
	static void fun1() {
			
			int a = 5;
			int b = 3;
			
			int c = a/b;
			System.out.println(c);
			
			try {
				fun2();
			}catch(Exception e) {
				System.out.println(e.getMessage()+" Given Error.");
			}
			
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			Thread.sleep(3000);
//			
//			System.out.println("Hello");
			
		}	
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isTrue = true;
		if(isTrue) {
			throw new ArrayIndexOutOfBoundsException("Danger");
		}
	}

}
