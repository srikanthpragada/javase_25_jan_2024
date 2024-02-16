package lib1;

public class TotalOfNums {
	public static void main(String[] args) {
		 
		String data = "90,34,45,56,88";
		var parts = data.split(",");
		
		int total = 0;
		for(var p : parts)
			total += Integer.parseInt(p);
		
		System.out.println(total);
		
	}

}
