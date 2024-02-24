package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) throws IOException {
		String[] names = { "James", "Anders", "Dennies", "Rossum" };

		// Try with resources - ARM 
		try (FileWriter fw = new FileWriter("names.txt")) {
			for (var name : names)
				fw.write(name + "\n");
		}

	}

}
