package adv;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class HighPrices {
	public static void main(String[] args) throws Exception {
		var path = Path.of("prices.txt");

		var optavg = Files.lines(path)
				          .mapToInt(v -> Integer.parseInt(v))
				          .average();

		var avg = optavg.getAsDouble();

		Files.lines(path)
		     .mapToInt(Integer::parseInt)
		     .filter(v -> v > avg)
		     .forEach(System.out::println);

	}
}
