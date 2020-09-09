
public class GenericTester {
	
	public static void main(String[] args) {
		
		//Create 6 Contact objects
		Contact jim = new Contact("Jim", "Keeler","125 Main St.", "5551212");
		Contact kim = new Contact("Kim", "Payne","125 Main St.", "5551212");
		Contact jane = new Contact("Jane", "Reynolds","125 Main St.", "5551212");
		Contact steve = new Contact("Steve", "Malone","125 Main St.", "5551212");
		Contact julie = new Contact("Julie", "Reynolds","125 Main St.", "5551212");
		Contact shangwen = new Contact("Shangwen", "Liu", "22 Main St.", "5551212");
		
		ArrayCollection<Contact> addressBook = new ArrayCollection<>();
		addressBook.add(jim);
		addressBook.add(kim);
		addressBook.add(jane);
		addressBook.add(steve);
		addressBook.add(julie);
		addressBook.add(shangwen);
		
		//Test toString, add, and enlarge methods
		System.out.println("toString expected: Jim Keeler 5551212,Kim Payne 5551212,Jane Reynolds 5551212,Steve Malone 5551212,Julie Reynolds 5551212,Shangwen Liu 5551212");
		System.out.println("toString acutal:   "+addressBook.toString());
		System.out.println();
		
		//Test remove method
		//Note: the order of the elements does not matter here.
		//Method is correct if collections contain the SAME elements
		addressBook.remove(jane);
		System.out.println("remove expected: Jim Keeler 5551212,Kim Payne 5551212,Shangwen Liu 5551212,Steve Malone 5551212,Julie Reynolds 5551212");
		System.out.println("remove acutal:   "+addressBook.toString());
		System.out.println();
		
		//Test contains method - element in collection
		System.out.println("contains expected: true");
		System.out.println("contains acutal:   "+addressBook.contains(shangwen));
		System.out.println();
		
		//Test contains method - element NOT in collection
		System.out.println("contains expected: false");
		System.out.println("contains acutal:   "+addressBook.contains(jane));
		System.out.println();
		
		//Test isEmpty method
		System.out.println("isEmpty expected: false");
		System.out.println("isEmpty acutal:   "+addressBook.isEmpty());
		System.out.println();
		
		//Test size method
		System.out.println("size expected:  5");
		System.out.println("isEmpty acutal: "+addressBook.size());
		System.out.println();
		 
		//Test toArray method
		//Note the order is not important
		//Make sure all of the elements are there
		System.out.println("toArray expected: Jim Keeler 5551212 Kim Payne 5551212 Shangwen Liu 5551212 Steve Malone 5551212 Julie Reynolds 5551212 ");
		System.out.print("toArray actual:   ");
		Object[] array = addressBook.toArray();
		for(Object o: array) {
			System.out.print(o.toString() + " ");
		}
	}
}
