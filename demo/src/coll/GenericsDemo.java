package coll;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		
//		al.add("Abc");
//		al.add(10); // AutoBoxing
//		
//		String s = (String) al.get(1);
		
		var al = new ArrayList<String>();
		al.add("Abc");
		
		String s = al.get(0);
	
		
	}

}
