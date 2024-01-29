package basics;

import java.util.Scanner;

public class NetPrice {

	public static void main(String[] args) {
		 
		 Scanner s = new Scanner(System.in); // read from keyboard 
		 System.out.print("Enter price :");
		 int price = s.nextInt();  // read an int 
		 
		 int discount = price * 10 / 100; 
		 int netPrice = price - discount;
		 
		 System.out.println(netPrice);
		 s.close();
		 
	}

}
