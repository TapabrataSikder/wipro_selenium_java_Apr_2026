package IO_Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;



public class Buf_reader 
{

	public static void main(String[] args) throws IOException 
	{
		
		// Create File
		File f1=new File("Test.txt");
		f1.createNewFile();
		
		// Write File
		BufferedWriter bw=new BufferedWriter(new FileWriter("Test.txt"));
		bw.write("My name is Rahul");
		bw.close();
		
		// Read File
		BufferedReader br=new BufferedReader(new FileReader("Test.txt"));
		String st1;
		while((st1=br.readLine()) != null)
		{
			System.out.println(st1);
		}
		br.close();
				
	}

}
