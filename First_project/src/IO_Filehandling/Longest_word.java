package IO_Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Longest_word {

	public static void main(String[] args) throws IOException {
		// Read File
				BufferedReader br = new BufferedReader(new FileReader("Sample2.txt"));
				
				int count = 0;
				String st;
				String max="";
				
				while((st=br.readLine())!=null)
				{
					System.out.println(st);
					String[] words = st.trim().split("\\s+");
					
					for(String word : words) {
						if(word.length()>max.length()) {
						max=word;
						}
					}
					
				}
				
				System.out.println("Longest word= "+max);
				br.close();


	}

}
