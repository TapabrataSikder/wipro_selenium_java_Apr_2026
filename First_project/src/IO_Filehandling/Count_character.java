package IO_Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Count_character {

	public static void main(String[] args) throws IOException {

		File f1=new File("Sample2.txt");
		f1.createNewFile();
				
		// Write File
		BufferedWriter bw=new BufferedWriter(new FileWriter("Sample2.txt"));
		bw.write("My name is Rahul. I am good boy.\n");
		bw.write("I am from Kolkata.");
		bw.close();
				
		BufferedReader br = new BufferedReader(new FileReader("Sample2.txt"));
	
        int count = 0;
        int countw=0, cl=0;
        String st;
        while((st=br.readLine())!=null)
        {
        	cl++;
        	
        	System.out.println(st);
        	String[] words=st.trim().split("\\s+");
        	
        	count = count+st.length();
        	countw = countw+words.length;
        }

        System.out.println("Character count = "+count);
        System.out.println("Word count = "+countw);
        System.out.println("Lines count = "+cl);
        br.close();
        

	}

}
