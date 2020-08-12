package oops.finalKeyword;

public class MainClass extends Student{

//	public void study() {
//		System.out.println("Aman is studying.");
//	}
	
	public static void main(String[] args) {
		
		final Student s1 = new Student();
//		Student s2 = new Student();
		
//		s1 = s2;
		s1.classes = 10;
		System.out.println(s1.classes);


	}

}
