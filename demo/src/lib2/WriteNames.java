package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String[] names = { "James", "Anders", "Dennies", "Rossum" };

		FileWriter fw = new FileWriter("names.txt");
		
		for(var name : names)
			 fw.write(name + "\n");
		
		fw.close();
		
	}

}
