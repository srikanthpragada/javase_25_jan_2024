package lib2;

import java.io.RandomAccessFile;

public class ReadMarks {

	public static void main(String[] args) throws Exception {

		var raf = new RandomAccessFile("marks.dat", "r");

		int rollnos[] = { 3, 9, 20, 45, 80, 35 };

		for (int rollno : rollnos) {
			
			int pos = (rollno - 1) * 4;
			try {
				raf.seek(pos);
				System.out.printf("%2d - %3d\n", rollno, raf.readInt());
			} catch (Exception ex) {
				System.out.println("Sorry! Invalid Rollno!");
			}

		}
		raf.close();

	}

}
