package oop1;

class Account {
	// Instance variables
	private int acno;
	private String customer;
	private double balance;
	
	// Class variable
	private static int minbal = 10000;

	public Account(int acno, String customer, double balance) {
		super();
		this.acno = acno;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int acno, String customer) {
		this(acno, customer, 0);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - Account.minbal >= amount)
			this.balance -= amount;
		else
			throw new IllegalArgumentException("Insufficient Balance!");
	}

	public double getBalance() {
		return this.balance;
	}

	public String getCustomer() {
		return this.customer;
	}

	public int getAcno() {
		return this.acno;
	}

	public static int getMinbal() {
		return Account.minbal;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(1, "Jack", 10000);
		a1.deposit(5000);
		a1.withdraw(20000);
		System.out.println(a1.getBalance());
		System.out.println(Account.getMinbal());
	}

}
