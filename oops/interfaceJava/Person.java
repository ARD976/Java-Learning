package oops.interfaceJava;

public class Person implements Student , Youtuber{

	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		obj.makeVideo();

	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making video.");
		
	}

	@Override
	public void study() {
		System.out.println("Person is studying.");
		
	}

	@Override
	public void videoEdit() {
		System.out.println("Video is edited.");
		
	}

}
