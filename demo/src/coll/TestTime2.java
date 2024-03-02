package coll;

import java.util.TreeSet;

class MyTime implements Comparable<MyTime> {
	private int h,m,s;
	
	public MyTime(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public String toString() {
		return h + ":" + m + ":"+ s;
	}
	
	public int hashCode() {
		return 1;
	}
	
	public boolean equals(Object obj) {
		var other = (MyTime) obj;
		return this.h == other.h && 
			   this.m == other.m && this.s == other.s;
	}

	public int totalSeconds() {
		return  this.h * 3600 + this.m * 60 + this.s;
	}
	
	@Override
	public int compareTo(MyTime other) {
		 return this.totalSeconds()  - 
				other.totalSeconds();
	}
	
}
public class TestTime2 {

	public static void main(String[] args) {
       var times = new TreeSet<MyTime>();
       times.add(new MyTime(10,20,30));
       times.add(new MyTime(1,2,3));
       times.add(new MyTime(10,20,30));
       times.add(new MyTime(10,10,10));
       
       
       for(var time : times) {
    	   System.out.println(time);
       }
	}

}
