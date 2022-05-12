package aaa;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class aaaa {
	
	public void output() {
		
		
		FileWriter fw = null;
		try {
		
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.write(95);
		
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
	
	}
	
}
