package oops;

class Vehicle{
	int wheels;
	int headLights;
	String colour;
	
	Vehicle(int wheels){
		this.wheels = wheels;
		headLights = 2;
	}
	
	Vehicle(int wheels , String colour){
		this.wheels = wheels;
		this.colour = colour;
	}
}

public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Constructor is created.");
	}
	
	public static void main(String[] args) {
//		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle(4);
		Vehicle car2 = new Vehicle(6,"Black");
		System.out.println(car.wheels+" "+"wheels");
		System.out.println(car2.wheels+" "+car2.colour);
	}

}
