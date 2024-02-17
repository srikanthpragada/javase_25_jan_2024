package oop2;

import java.util.Arrays;
import java.util.Comparator;

public class SortAbsNumbers {
	public static void main(String[] args) {
		 Integer [] nums = {10, -5, -20, 15, 50, -30};
		 
		 Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
			    return  Math.abs(n1) - Math.abs(n2);
			}
		 });
		 
		 Arrays.sort(nums, (n1, n2) -> Math.abs(n1) - Math.abs(n2));
		 
		 for(var n : nums)
			 System.out.println(n);
		 
		 
	}

}
