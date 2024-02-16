package oop2;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class SortByLength {
	public static void main(String[] args) {
		String names[] = { "Andy", "Jack", "Scott", "Ben", "Kevin", "Li" };

		// Arrays.sort(names);
		// Arrays.sort(names, new LengthCompare());

		// Anonymous inner class 
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		// Lambda expression 
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		for (var n : names)
			System.out.println(n);
	}

}
