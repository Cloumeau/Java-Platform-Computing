/**
 * Review of loops and arrays in Java
 * @author kathleen malone
 *
 */
public class LoopsAndArrays {
	
	/**
	 * Finds the maximum integer in an array of integers
	 * @param array the array to search for max element
	 * @return the max integer in an array
	 */
	public static int findMax(int[] array) {
		
		int max = array[0];
		for(int i = 1;i<array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		//To practice loops, let’s create an array. 
		//Who can tell me what an array is? - 
	    //“a data structure that holds a collection of elements. 
		//Each element is accessed through an index place.”
		int[] a = {1,2,3,4,5};
		//draw array on board
		//for loop to process array
		//within parenthesis of loop we have 3 statements
		//(draw on board) initialize counter(i); condition to end loop; increment counter
		
		for(int i=0;i<a.length;i++) {
			//what is syntax for printing each element of array
			System.out.println(a[i]);
		}
		
		//How would we print this array using a while loop?
		int counter=0;
		while(counter<a.length) {
			System.out.println(a[counter]);
			counter++;
		}
		
		//Find the max
		//write algorithm on board
		//1. store first element of array in variable
		//2. loop through the rest of the array and compare each element
		//of array to variable
		//3. update variable when a larger element is found
		
		int max = a[0];
		for(int i = 1;i<a.length;i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max is "+max);
		
		//What if we have a program that needs to use a find max algorithm several
		//times? What could we do with this code? Would we repeat it?
		//answer: put code in a method
		max = findMax(a);
		
		//What is the scope of the variables in findMax?
		//What do I mean by scope?
	}
}
