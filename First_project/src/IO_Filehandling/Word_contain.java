package IO_Filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Word_contain {

	public static void main(String[] args) throws IOException {
		File file=new File("Sample3.txt");
		file.createNewFile();
		
		FileWriter wr=new FileWriter("Sample3.txt");
		wr.write("Hello Java\n");
		wr.write("How are you?\n");
		wr.write("Java: I am fine.\n");
		wr.close();		
		BufferedReader br = new BufferedReader(new FileReader("Sample3.txt"));
		String l;
		
		while((l=br.readLine()) != null)
		{
			if(l.contains("Java"))
			{
				System.out.println(l);
			}
		}
		br.close();

	}

}
