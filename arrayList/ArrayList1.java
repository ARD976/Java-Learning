package arrayList;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList();
		ArrayList<String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		
		fruits.addAll(vegetables);
		
//		System.out.println(fruits.get(2));
		
		fruits.set(2, "Brinjal");
		
		fruits.remove(2);
		
		fruits.removeAll(vegetables);
		
//		fruits.clear();
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.contains("Orange"));
		
		System.out.println(fruits.isEmpty());
		
		System.out.println(fruits);

		Object x[] = fruits.toArray();
		for(Object item : x) {
			System.out.println(item);
		}
		
		String[] temp = new String[fruits.size()];
		fruits.toArray(temp);
		for(String item : temp) {
			System.out.println(item);
		}
	}

}
