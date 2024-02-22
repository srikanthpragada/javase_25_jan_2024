package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static int sumOfDigits(int n) {
		return 0;
	}

	public static void main(String[] args) {
		assert isEven(11) == false : "Not working for odd number";
		assert isEven(12) == true : "Not working for even number";
		
		assert sumOfDigits(123) == 6: "Not working for 123";
		
	}

}
