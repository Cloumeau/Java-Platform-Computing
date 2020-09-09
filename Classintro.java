
public class Classintro {

	
	public static void main(String[] args) {
	
		//primitive data type
		int x=10;
		
		//String is an object
		String hello= "hello";
		boolean sameValue = hello.contentEquals("hello");
		System.out.println(sameValue);
		
		hello =hello.concat("world");
		sameValue=hello.equals("hello");
		System.out.println(sameValue);
		
		
	// an object models real world things:information &data, behavior
		//Class is a blueprint of an object
		
		String newString = "another String object";
		
		//objects are the runtime instantiation of a class
		//Classes are organized into packages. To use a package, import.java
		//static variable - a variable whose value should be the same for every instantiation of a class.
		//public- used w or w/o class
		//private - used only w/n class
		//protected- used w/n class and package
		//indirect addressing (c1 and c2) copies memory address
		//Direct (intA and intB) copies values
		
		
		}
	
}
