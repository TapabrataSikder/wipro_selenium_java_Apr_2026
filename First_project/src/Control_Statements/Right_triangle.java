package Control_Statements;

public class Right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		for(i=1;i<=5;i++) {  // Row
			for(j=1;j<=i;j++) {  // Column
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
