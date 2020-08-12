package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Pet p = d;
		Pet p1 = new Pet();
		d.walk();
		p.walk();
		p1.walk();
		greeting();
		greeting("Chris Jericho");
		greeting("Orange Cassidy",5);

	}
	public static void greeting() {
		System.out.println("Hello");
	}
	public static void greeting(String name) {
		System.out.println("Hello "+ name);
	}
	public static void greeting(String name , int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Hello "+ name);
		}
	}

}
