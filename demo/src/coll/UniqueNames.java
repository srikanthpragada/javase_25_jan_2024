package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;

public class UniqueNames {

	public static void main(String[] args) throws IOException {
		var path = Path.of("names.txt");
		var names = Files.readAllLines(path);

		var uniqueNames = new HashSet<String>(names);

		for (var name : uniqueNames)
			System.out.println(name);
	}

}
