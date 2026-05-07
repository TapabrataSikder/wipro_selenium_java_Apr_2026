package Array;

import java.util.Scanner;

public class Largest_row_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		System.out.print("Enter column: ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter elements:");
		for (int i=0; i<row;i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j]=sc.nextInt();			
			}
		}
		
		for(int i=0;i<row;i++)
		{
			int max=arr[i][0];
			for(int j=1;j<col; j++)
			{
				if(arr[i][j]>max) {
					max=arr[i][i];
				}
			}
			System.out.println("Maximum element in row"+(i+1)+": "+max);
		}
		

	}

}
