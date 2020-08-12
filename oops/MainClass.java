package oops;

class Cat{
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is walking.");
	}
	
	public void eat() {
		System.out.println("Cat is eating.");
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.eat();
		cat1.walk();
		
		cat2.eat();
		cat2.walk();
		
		cat1.legs = 4;
		cat1.eyes = 2;
		
		System.out.println(cat1.legs+" "+cat1.eyes);

	}

}
