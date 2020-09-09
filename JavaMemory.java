
public class JavaMemory {
	
	public static void main(String[] args) {
		
		//4 Person ojbects
		Person pat = new Person("Pat",9);
		Person michelleM = new Person("Michelle", 11);
		Person michelleD = new Person("Michelle",11);
		Person john = new Person("John", 13);
		
		//4 int variables
		int patAge = pat.getAge();
		int michelleMAge = michelleM.getAge();
		int michelleDAge = michelleD.getAge();
		int johnAge = john.getAge();
		
		//compare primitive variable values
		//compare assigned values
		if(michelleMAge == michelleDAge) {
			System.out.println("Michelles age are the same value");
		} else {
			System.out.println("Michelles ages are not the same value");
		}
		
		//compare objects
		//each object holds a memory address of the object
		//each Michelle object has its own memory address
		if (michelleM == michelleD) {
			System.out.println("Michelles objects are the same value");
		} else {
			System.out.println("Michelles objects are not the same value");
		}	
		
		//assign pat object to john object
		pat = john;
		//pat now holds the same memory address as the john object
		//when compared the will evaluate to true
		if(pat == john) {
			System.out.println("pat object now equals john object");
		} else {
			System.out.println("pat object still does not equal john object");
		}
	}
}
