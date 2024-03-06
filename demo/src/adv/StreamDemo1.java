package adv;

import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDemo1 {

	public static void main(String[] args) throws Exception {
		 
		 var path = Path.of("names.txt");
		 Files.lines(path)
		      .distinct()
		      .filter( n -> n.length() > 4)
		      .sorted()
		      .forEach(v -> System.out.println(v.toUpperCase()));
		 
		
		

	}

}
