package nestedIfElse;

public class nestedTernary {

	public static void main(String[] args) {
		int a=10,b=13,c=12;
		int result=0;
		result=a>b?a>c?a:c:b>c?b:c;
		System.out.println(result);

	}

}
