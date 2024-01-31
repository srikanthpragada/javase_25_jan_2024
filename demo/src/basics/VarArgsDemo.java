package basics;

public class VarArgsDemo {

	public static void wish(String... names) {
		for (String name : names)
			System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		wish("James", "Anders", "Dennis");
		wish("Ronaldo", "Messi");
	}

}
