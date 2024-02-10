package lib1;

class Course{
	private String title;
	private int fee;
	public Course(String title, int fee) {
		super();
		this.title = title;
		this.fee = fee;
	}
	@Override 
	public String toString() {
		return  this.title + "-" + this.fee;
	}
}


public class TestCourse {

	public static void main(String[] args) {
  
		var c1 = new Course("Java SE", 6000);
		var c2 = new Course("Java SE", 6000);
		var c3 = new Course("Java EE", 8000);
		
		System.out.println(c1);	
		System.out.println(c1.toString());
		
		

	}

}
