package IO_Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Num_of_lines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("demo.txt"));

        int c = 0;
        while(br.readLine() != null)
        {
        	c++;
        }
        System.out.println(c);
        br.close();
        
	}

}
