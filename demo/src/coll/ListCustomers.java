package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListCustomers {

	public static void main(String[] args) throws IOException {
		var path = Path.of("customers.txt");
		var lines = Files.readAllLines(path);

		var customers = new TreeMap<String, String>();

		for (var line : lines) {
			var parts = line.split(",");
			if (parts.length > 1)
    			customers.put(parts[0].trim(), parts[1].trim());
		}

		for (var name : customers.keySet()) {
			System.out.printf("%-15s  %s\n", name, customers.get(name));
		}

	}

}
