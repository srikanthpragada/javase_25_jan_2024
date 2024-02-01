package oop1;

public class Product {
	// Instance variables 
	private String name;
	private int price;
	
	// Methods 
	public void create(String n, int p) {
		 name = n;
		 price = p;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
	
	public int getNetPrice() {
		return  price + price * 12 / 100;
	}
}

