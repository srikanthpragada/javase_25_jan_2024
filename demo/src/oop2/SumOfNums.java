package oop2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNums {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int n = s.nextInt();
				total += n;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid Number!");
				s.next(); // clear buffer 
			}

		}

		System.out.println(total);

	}

}
