package IO_Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Word_repitition {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("Sample3.txt"));
		
		int count = 0;
		String wrd="Java";
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
			String[] words = st.trim().split("\\s+");
			
			for(String w : words)
			{
				String l=w.replaceAll("[^a-zA-Z]", "");
				if (l.equals(wrd)) {
					count++;
				}
			}
			
		}
		
		System.out.println("Word count = "+count);
		br.close();

	}

}
