package oop2;

public class ExceptionsDemo {

	public static void main(String[] args) {
		String s = "a10";

		try {
			int n = Integer.parseInt(s);
			int q = 100 / n;
			System.out.println(q);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} 
//		catch (ArithmeticException ex) {
//			System.out.println("Zero is not allowed!");
//		}
		finally {
			System.out.println("Finally!");
		}

		System.out.println("Done!");
	}

}
