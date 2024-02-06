package oop1;

class Person {
	protected String name, email;
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
}

class Employee extends Person  {
	 private String job;
	 
	 public Employee(String name, String email, String job) {
		 super(name, email); // call super class constructor
		 this.job = job;
	 }
	 
	 // Overriding 
	 public void print() {
		 super.print(); // super class's print()
		 System.out.println(this.job);
	 }
	 
}

public class TestPersons {

	public static void main(String[] args) {
		Employee e = new Employee("Jack", "jack@gmail.com", "Programmerr");
		e.print(); 

	}

}
