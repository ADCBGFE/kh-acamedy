package aaa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class exam01 {
	public static void main(String[] args) {
		
//		FileWriter fw = null;
//		try {
//			
//			fw = new FileWriter("test.txt");
//			fw.write(97);
//			fw.write(65);
//			fw.flush();
		
		File f = new File("C:/Users/SEO/eclipse/read_test.txt");
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write(97);
			fw.write(95);
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
