package oop1;

public class TestProduct {

	public static void main(String[] args) {
		 Product p1; // object reference 
		 
		 p1 = new Product("Bose Speakers",28000);
		 p1.print(); 
		 
		 System.out.println(p1.getNetPrice());
	 
		 //System.out.println(p1.name);
 
	}

}
