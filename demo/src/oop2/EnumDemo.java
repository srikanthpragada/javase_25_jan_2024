package oop2;

import java.time.Month;

enum PayMode {
	CASH, UPI, CARD
}

class Payment {
	private int amount;
	private PayMode mode;

	public Payment(int amount, PayMode mode) {
		this.amount = amount;
		this.mode = mode;
	}

	public PayMode getMode() {
		return this.mode;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		var p = new Payment(1000, PayMode.UPI);

		if (p.getMode() == PayMode.CARD)
			System.out.println("Card");
	}

}
