package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortUniqueWords {

	public static void main(String[] args) throws IOException {
		var path = Path.of("article.txt");
		var contents = Files.readString(path);
		var pattern = Pattern.compile("[\\W\\d]+");  // non-word 
		
		var words = pattern.split(contents);  // String[]
		var sortedWords = new TreeSet<String>(Arrays.asList(words));
		
		for(var word : sortedWords) {
			System.out.println(word);
		}
		
		

	}

}
