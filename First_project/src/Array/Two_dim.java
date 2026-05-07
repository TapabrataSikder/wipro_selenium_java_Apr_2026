package Array;

public class Two_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{20, 40}, {50, 60, 80}, {10, 30, 70, 90}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
