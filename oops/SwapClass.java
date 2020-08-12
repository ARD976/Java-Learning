package oops;

class Dog{
	int legs;
}


public class SwapClass {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.legs=4;
		change(a);
		System.out.println(a.legs);
//		Dog b = new Dog();
//		b.legs=2;
//		swap(a,b);
//		System.out.println(a.legs+" "+b.legs );

	}
	
//	static void swap(Dog c , Dog d) {
//		Dog temp = c;
//		c = d;
//		d = temp;
//	}
	static void change(Dog dog) {
		dog.legs = 6;
	}
	
}

