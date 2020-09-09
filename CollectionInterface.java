/**
 * A generic Collection interface
 */
public interface CollectionInterface<T> {
	//initial size of the array
	final int DEFAULT_CAPACITY = 5;
	
	/**
	 * Adds an element to the Collection
	 * Collection is never full. Must enlarge if reach default capacity.
	 * @param element
	 * @return true if element was successfully added, false otherwise
	 */
	boolean add(T element);
	
	/**
	 * Search for the element in the Collection. If the element is found remove the element.
	 * This method uses the objects equals method to check for equality. (This is why
	 * you must implement the equals method on the Contact class).
	 * Remember to decrement the size of the Collection after removing an element.
	 * A Collection does not guarantee the order of the elements. After removing an element
	 * you do not have to keep the elements in order.
	 * @param element
	 * @return
	 */
	boolean remove(T element);
	
	/**
	 * Searches for an element in the Collection
	 * This method uses the objects equals method to check for equality.
	 * @param element
	 * @return true if found, false otherwise
	 */
	boolean contains(T element); 
	
	/**
	 * Check if the Collection is empty
	 * @return true if there are no elements in the Collection, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Gets the size of the Collection
	 * @return the number of elements in the Collection
	 */
	int size();
	
	/**
	 * Returns all of the elements in the Collection in an array of Objects
	 * @return elements in an array
	 */
	Object[] toArray(); 
	
	/**
	 * 
	 * 
	 * Returns a comma delimited version of the objects in the Collection
	 * Method uses the toString() method on the objects in the Collection (This
	 * is why you must implement the toString() method in the Contact class).
	 * @return the comma delimited array as a String
	 */
	public String toString();
}
 