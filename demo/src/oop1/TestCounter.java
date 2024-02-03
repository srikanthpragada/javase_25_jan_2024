package oop1;

class Counter {
	private int value;
	
	public Counter() {
		this.value = 1;
	}
	public Counter(int v) {
		this.value = v;
	}
	
	public void increment() {
		this.value ++;
	}
	
	public void decrement() {
		this.value --;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class TestCounter {

	public static void main(String[] args) {
		 Counter c1 = new Counter();
		 c1.increment();
		 System.out.println(c1.getValue());
		 
		 Counter c2 = new Counter(100);
		 c2.increment();
   }

}
