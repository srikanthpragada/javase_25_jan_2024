package oop1;

abstract class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}

	public String getEmail() {
		return this.email;
	}
	
	public abstract String getOccupation();  
}

class Employee extends Person {
	private String job;

	public Employee(String name, String email, String job) {
		super(name, email); // call super class constructor
		this.job = job;
	}

	// Overriding
	@Override
	public void print() {
		super.print(); // super class's print()
		System.out.println(this.job);
	}
	
	public void setJob(String job) {
		this.job = job; 
	}
	
	@Override
	public String getOccupation() {
		return "Working as " + this.job; 
	}
}

class Student extends Person {
	private String course;

	public Student(String name, String email, String course) {
		super(name, email); // call super class constructor
		this.course = course;
	}

	// Overriding
	@Override
	public void print() {
		super.print(); // super class's print()
		System.out.println(this.course);
	}
	
	public String getOccupation() {
		return "Studying " + this.course; 
	}

}

public class TestPersons {

	public static void main(String[] args) {
		Person p = new Employee("Jack", "jack@gmail.com", "Programmerr");
		p.print();  // Runtime Polymorphism
		System.out.println(p.getOccupation());
		
		
		p = new Student("Scott", "scott@gmail.com", "MSCS");
		p.print();  // Runtime Polymorphism
		System.out.println(p.getOccupation());
		
		// Compile-time polymorphism
		System.out.println(10);
		System.out.println(10.50);
	}

}
