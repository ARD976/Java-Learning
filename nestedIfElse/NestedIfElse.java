package nestedIfElse;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		int a=10,b=13,c=12;
		int result=0;
		if(a>b) {
			if(a>c) {
				result=a;
			} else {
				result=c;
			}
		} else {
			if(b>c) {
				result=b;
			} else {
				result=c;
			}
		}
		System.out.println("Largest number out of three is "+ result);
	}
}
