package Array;

public class Three_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr = {{{10, 20}, {30, 40}, {50, 60, 70}, {80, 90, 100}}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
