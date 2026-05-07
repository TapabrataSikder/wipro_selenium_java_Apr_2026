package Control_Statements;

public class Left_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		for(i=5;i>=1;i--) {  // Row
			for(j=i;j>=1;j--) {  // Column
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
