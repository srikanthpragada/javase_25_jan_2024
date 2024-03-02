package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class WriteUniqueNames2 {

	public static void main(String[] args) throws IOException {
		var spath = Path.of("names.txt");
		var tpath = Path.of("uniquenames.txt");
	
		var names = Files.readAllLines(spath);
		var uniqueNames = new LinkedHashSet<String>(names);
  
		String output = "";
		for (var name : uniqueNames)
			 output += name.toUpperCase() + "\n";
		
		
		Files.writeString(tpath, output);
		
	}

}
