package coll;

import java.time.LocalDate;

public class GenericMethods {

//	public static void print(String [] values) {
//
//		for (var v : values)
//			System.out.println(v);
//	}
//
//	public static void print(int[] values) {
//
//	}
//
//	public static void print(LocalDate[] values) {
//
//	}

	public static <T> void show(T[] values) {
		for (T v : values)
			System.out.println(v);
	}

	public static void main(String[] args) {
		String[] names = { "abc", "xyz" };
		Integer[] nums = { 10, 20, 30 };

		show(names);
		show(nums);
	}

}
