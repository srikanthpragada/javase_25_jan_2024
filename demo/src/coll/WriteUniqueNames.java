package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class WriteUniqueNames {

	public static void main(String[] args) throws IOException {
		var spath = Path.of("names.txt");
		var tpath = Path.of("uniquenames.txt");
		var bw = Files.newBufferedWriter(tpath);
		
	
		var names = Files.readAllLines(spath);

		var uniqueNames = new LinkedHashSet<String>(names);

		for (var name : uniqueNames)
			 bw.write(name + "\n");
		
		bw.close();
		
			
	}

}
