package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		 Path p = Path.of("names.txt");
		 
		 //System.out.println(p.getClass());
		 
		 System.out.println(Files.readString(p));
		 
	}

}
