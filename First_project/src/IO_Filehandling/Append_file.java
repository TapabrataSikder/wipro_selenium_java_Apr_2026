package IO_Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Append_file {

	public static void main(String[] args) throws IOException {
		FileWriter wr=new FileWriter("demo.txt", true);
		wr.write("\nPyth prog");
		wr.close();       
   	

	}

}
