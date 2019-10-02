
public class Array2DDemo {
	
	/**
	 * Prints a 2D array. Use for debugging
	 * @param a - 2D array
	 */
	
	static void printArray2D(int[][] a) {
		
		int row=0;
		int col=0;
		for(row=0;row<5;row++) {
			for(col=0;col<5;col++) {
				System.out.print(a[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
