package oops.finalKeyword;

public class Student {

		final int age;
		final String name;
		int classes = 7;
		
		{
			age = 5;
//			name = "Aman";
		}
		
		public Student(){
			name = "Aman";
		}
		
		final public void study() {
			System.out.println("Student is studying.");
		}
	
}
