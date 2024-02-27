package lib2;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 
		var raf = new RandomAccessFile("marks.dat", "rw");
		
		for(int i = 1; i <= 50; i ++)
			raf.writeInt( (int) (Math.random() * 100));
		
		raf.close();
		
	}

}
