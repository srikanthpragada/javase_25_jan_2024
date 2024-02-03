package oop1;

public class Product {
	// Instance variables
	private String name;
	private int price;

	// Constructor
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name) {
		this(name, 0);  // call another constructor 
	}

	// Methods
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}

	public int getNetPrice() {
		return this.price + this.price * 12 / 100;
	}
}
