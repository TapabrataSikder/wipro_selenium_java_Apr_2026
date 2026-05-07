package Control_Statements;

public class Pyramid_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;

        for (int i = row; i >=1; i--) {
            for (int j = 0; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
