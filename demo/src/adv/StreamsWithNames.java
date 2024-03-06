package adv;

import java.util.stream.Stream;

public class StreamsWithNames {

	public static void main(String[] args) {
		var s = Stream.of(10, 20, 11, 44, 55, 34, 33);
		
		s.filter( v -> v % 2 == 0)  			// Predicate ->  boolean test(T v)
		 .sorted()
		 .forEach(System.out::println);         // Consumer -> void accept(T v)
		

	}

}
