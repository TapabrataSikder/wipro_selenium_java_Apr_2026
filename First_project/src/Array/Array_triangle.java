package Array;

public class Array_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = {{1}, {1, 2}, {10, 30, 70, 90}};
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				arr[i][j] = j + 1;
			}
		}
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

	}

}
