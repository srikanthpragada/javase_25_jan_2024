package basics;

import java.util.Scanner;

public class NetPrice2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // read from keyboard
		System.out.print("Enter price :");
		int price = s.nextInt(); // read an int

		int discount = price * 10 / 100;
		int netPrice = price - discount;

		System.out.printf("Price        : %5d\n",price);
		System.out.printf("- discount   : %5d\n",discount);
		System.out.printf("Net Price    : %5d\n",netPrice);
		
		s.close();

	}
}
