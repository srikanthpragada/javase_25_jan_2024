package lib1;

record Point(int x, int y) {
	// User-defined method 
	public void print() {
		System.out.println(this.x  + ":" + this.y);
	}
}


public class TestPoint {

	public static void main(String[] args) {
		var p1 = new Point(10,20);
		var p2 = new Point(10,20);
		var p3 = new Point(10,10);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.x());   // getter method 
		p1.print(); 

	}
}
