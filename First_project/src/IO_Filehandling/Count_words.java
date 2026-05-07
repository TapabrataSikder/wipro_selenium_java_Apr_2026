package IO_Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Count_words {

	public static void main(String[] args) throws IOException {
		
		// Read File
		BufferedReader br = new BufferedReader(new FileReader("Sample2.txt"));
		
		int count = 0;
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
			String[] words = st.trim().split("\\s+");
			
			if (!st.trim().isEmpty()) {
				count = count+words.length;
			}
		}
		
		System.out.println("Word count = "+count);
		br.close();

	}

}
