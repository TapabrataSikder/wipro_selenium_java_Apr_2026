package IO_Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_file {

	public static void main(String[] args) throws IOException {
		// Read File
		File file=new File("demo.txt");
		file.createNewFile();
		
		FileWriter wr=new FileWriter("demo.txt");
		wr.write("Hello\n");
		wr.write("World\n");
		
		
		wr.close();
		
		
	}

}