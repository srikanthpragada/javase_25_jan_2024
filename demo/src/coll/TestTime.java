package coll;

import java.util.HashSet;

class Time  {
	private int h,m,s;
	
	public Time(int h, int m, int s) {
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
		Time other = (Time) obj;
		return this.h == other.h && 
			   this.m == other.m && this.s == other.s;
	}
	
}
public class TestTime {

	public static void main(String[] args) {
       var times = new HashSet<Time>();
       times.add(new Time(10,20,30));
       times.add(new Time(1,2,3));
       times.add(new Time(10,20,30));
       times.add(new Time(10,10,10));
       
       
       for(var time : times) {
    	   System.out.println(time);
    	   System.out.println(time.hashCode());
       }
	}

}
