package IO_Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rewrite_file {

	public static void main(String[] args) throws IOException 
	{
		// Create File
				File f1=new File("Test1.txt");
				f1.createNewFile();
				
				// Write File
				BufferedWriter bw=new BufferedWriter(new FileWriter("Test1.txt"));
				bw.write("Python is a prog lang. Python has shorter code. Python asldjaksjf. ldkjfkasjdfk Python");
				bw.close();
				        
		        // Replace
		        BufferedReader br2=new BufferedReader(new FileReader("Test1.txt"));
				String st2;
				while((st2=br2.readLine()) != null)
				{
					System.out.println(st2);
					System.out.println(st2.replace("Python", "Java"));
				}
				br2.close();	

	}

}

// OVERWRITE THE FILE

//Read File and Replace
//StringBuilder word = new StringBuilder();
//BufferedReader br=new BufferedReader(new FileReader("Test1.txt"));
//String st1;
//while((st1=br.readLine()) != null)
//{
//	word.append(st1.replace("Python", "Java")).append("\n");
//}
//br.close();		
//
//// Write after replace
//BufferedWriter wr1 = new BufferedWriter(new FileWriter(f1));
//wr1.write(word.toString().trim());
//wr1.close();