/**
 * 
 * @author c2lou
 *
 */
public class ArrayProcessing {
	
	 //* @param a the array
	 //* @return the maximum element
	 
	public static int findMax(int[] a) {
	
	int max = a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i] > max) {
			max = a[i];
			
		}
	}
	return max;
}
	//**
	// * Find the minimum element in an array of integers
	// //* @param a the array
	// * @return the minimum
	// *
	public static int findMin(int[] a) {	
		
			    int min = a[0];
				   for(int i=1;i<a.length;i++) {
					   if (a[i]<min) {
						   min = a[i];
				   }
		 }
     return min;
	}
	
	/**
	 * Find the average value of an array of integers
	 * @param a the array 
	 * @return the average
	 */
	public static int findAverage(int[]a) {
	    { 
	   int average =0;
	   int sum =0;
	   for(int i=0; i<a.length;i++) {
		   sum +=a[i];
		   }
	   
		   average =sum/a.length;
		   
		   return average;
	   }
}

	/**
	 * Searched the array for a given target
	 * @param a the array
	 * @param target the target value to find
	 * @return true if value is found, false otherwise
	 */
	public static boolean search(int[] a, int target) {
		for(int i =0; i<a.length;++i) {
			if (a.equals(target)) {
			return true;
		
		}
		
		}
		return false;
		
	}
	
	/**
	 * Prints each element of the array on a separate new line	
	 * @param a the array to print
	 */
	public static void printArray(int[] a) {
		for(int i=0; i<a.length;i++) {
			   System.out.println(a[i]+",");
		}	   
		}
	/**
	 * Prints each element of the array separated by a comma
	 * array {5, 10 ,20} would print as 5,10,20
	 * @param a the array
	 */
	public static void printCommaDelimitedArray(int[] a) {
		System.out.println(a[0]);
		for(int i=0; i<a.length;i++) {
			   System.out.print(a[i]+",");
			   
	}
}
	
}
	