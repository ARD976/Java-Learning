package takingVariable;

import oops.packages.models.Student;

public class A {

	public static void main(String[] args) {
		Student boy = new Student("Tommy");
		boy.getName();
		System.out.println(boy.getName());
		
		String name = "12345";
		int alpha = 2;
		System.out.println(name.charAt(1));
//		for(int i=0;i<name.length();i++) {
//			
//			System.out.println(name.charAt(i));
//		}
		if(name.charAt(1)==(char)alpha)
			System.out.println("Count");
		
//		String name = "Aman";
	}

}
