package coll;
import java.util.ArrayList;

public class ListNames {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("James");
		 names.add("Anders");
		 
		 names.remove(0);
		 
		 names.add(0, "Dennis");
		 
		 for (var name : names) {
			 System.out.println(name);
		 }
	 
		 System.out.println( names.indexOf("James"));
	}

}
