package basics;

public class PrintArray {

	public static void main(String[] args) {
		int a[] = {1,4,5,6,9};

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		for (int i = a.length - 1; i >= 0; i --)
			System.out.println(a[i]);

	}

}
