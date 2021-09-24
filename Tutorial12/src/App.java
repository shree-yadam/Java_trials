
public class App {

	public static void main(String[] args) {
		int[] values = {1, 3, 324};
		
		System.out.println(values[2]);

		int[][] grid = {{2, 4, 6},
				{3, 5, 7},
				{5 , 7, 9, 11}
		};
		
		for(int[] row:grid) {
			for(int num: row) {
				System.out.println(num);
			}
		}
	}

}
