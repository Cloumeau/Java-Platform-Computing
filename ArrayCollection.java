/**
 * 
 * @author c2lou
 *
 * @param <T>
 */
public class ArrayCollection<T> implements CollectionInterface<T> {

	T[] array;
	int size;

	ArrayCollection () {
		array = (T[]) new Object[DEFAULT_CAPACITY];
		size =0;
	}
	  
	/**
	 * enlarges array through a for loop
	 */
	public void enlargeArray() {
		
		T[] temp = (T[]) new Object[size+100];
		for (int i=0;i<array.length;++i) {
			temp[i] = (T) array[i];
		}
	array=temp;
	}
	/**
	 * adds an element to array and enlarges array if not enough space
	 */
	public boolean add(T element) {
		if(size==array.length) {
			enlargeArray();
		}
		array[size]=element;
		size++;
		// TODO Auto-generated method stub
		return true;
	}
	 
/**
 * searches array and removes element 
 */
	public boolean remove(T element) {
		for(int i = 0; i< size; i++ ) {
			if(element.equals(array[i])) {
			array[i]=array[size-1];
			
			size--;
	       
			return true;
		}
		
		}
		return false;
	}
/**
 * seraches array if array contains element
 */
	@Override
	public boolean contains(T element) {
		for(int i=0;i<size;i++) {
			if(element.equals(array[i])) {
				return true;
			}}
		return false;
		
	}
/**
 * checks if array is empty
 */
	@Override
	public boolean isEmpty() {
		if (array.length != 0) {
	
		return false;
	}
		return true;
	}
/**
 * gets size of array
 */
	@Override
	public int size() {
		return size;
	} 

	@Override
	public Object[] toArray() {
		 	
		Object[] temparray = new Object[size];
		for( int i=0; i<size;i++) {
			temparray[i]=array[i];
		}
		     return temparray; 
		}
	
	public String toString() {
		String temp = array[0].toString();
		for(int i=1;i<size;i++) {
			temp +="," + array[i].toString();
			
		}
		return temp;
		
		
	}
}


