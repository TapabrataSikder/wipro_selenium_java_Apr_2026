package IO_Filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_file {

	public static void main(String[] args) throws IOException {
		// Read File
		File file=new File("C:\\Users\\TAPABRATA\\Desktop\\sample.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
	
		sc.close();
	}

}
