package adv;

class MyCode implements Runnable  {
	@Override
	public void run() {
		 System.out.println("I am in MyCode!");
	}
	
}
public class LambdaDemo {
	
	public static void printNumbers() {
		 for(int i = 1; i <= 5; i ++)
	    	  System.out.println(i);
	}

	public static void main(String[] args) {
		 
       Thread t1 = new Thread(new MyCode());
       //t1.start();
       
       // Lambda Expression
       Thread t2 = new Thread(() -> System.out.println("Lambda Expression"));
       t2.start();
       
       // Lambda Block
       Thread t3 = new Thread(() -> { 
    	      for(int i = 1; i <= 5; i ++)
    	    	  System.out.println(i);
       });
       t3.start();
       
       // Method reference
       Thread t4 = new Thread(LambdaDemo::printNumbers);
       t4.start();
	}

}
