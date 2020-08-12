package oops.generic;

public class MainClass {

	public static void main(String[] args) {
		
		Pair<Integer , String > obj = new Pair(25 , "Aman");
		Pair<String , Float> obj2 = new Pair("Raj" , 32.4);
		
		obj.getDescription();
		obj2.getDescription();

	}

}
