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

	public String getEmail() {
		return this.email;
	}
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
}

public class TestPersons {

	public static void main(String[] args) {
		Employee e = new Employee("Jack", "jack@gmail.com", "Programmerr");
		e.setJob("Sr. Programmer");
		e.print();
		System.out.println(e.getEmail());
		
	    Person p;
	    p = e;   // Upcasting 
	    
	    p = new Student("Joe", "joe@gmail.com", "MSCS");
	    
	    if(p instanceof Employee)
	        e = (Employee) p;  // Downcasting 
	    
	    // Check and convert 
	    if(p instanceof Student s)
	    {
	    	s.print(); 
	    }
	    	

	}

}
