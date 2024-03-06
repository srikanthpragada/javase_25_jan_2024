package adv;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class SortPrices {

	public static void main(String[] args) throws Exception {
		 var path = Path.of("prices.txt");
		 
		 Files.lines(path)
		      .filter( v ->  Pattern.matches("[0-9]+", v))
		      .mapToInt(v -> Integer.parseInt(v))
		      .sorted()
		      .limit(5)
		      .forEach(System.out::println);
	}

}
