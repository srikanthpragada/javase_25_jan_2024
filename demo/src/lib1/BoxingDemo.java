package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj;
		 
		 
		 obj = "String";  // upcasting
		 System.out.println(obj.getClass());
		 obj = 10;  //  new Integer(10)  --> Auto Boxing 
		 System.out.println(obj.getClass());
		 
		 int v = (Integer) obj;  // Downcasting then unboxing 
		 
		 Object o = new Integer(10);
		 
		 var s = "Hello";
		 
	}

}
