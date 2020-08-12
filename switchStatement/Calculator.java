package switchStatement;
import java.util.Scanner;

public class Calculator {
	 
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		int a=ab.nextInt();
		int b=ab.nextInt();
		ab.nextLine();
		char oper=ab.nextLine().charAt(0);
		
		switch (oper) {
		case '+':
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;
			
		case '%':
			System.out.println(a%b);
			break;
			
		default:
			System.out.println("Wrong operation performed.");
		}
		ab.close();
	}
	
}
