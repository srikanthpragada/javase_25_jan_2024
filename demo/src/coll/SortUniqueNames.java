package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortUniqueNames {

	public static void main(String[] args) throws IOException {
		var path = Path.of("names.txt");
		var names = Files.readAllLines(path);

		var sortedNames = new TreeSet<String>(names);

		for (var name : sortedNames)
			System.out.println(name);
	}

}
