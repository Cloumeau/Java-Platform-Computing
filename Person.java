/**
 * 
 * @author c2lou
 *
 */
public class Person {

	private String name;
	private int age;
	
	// constructor
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;  // this differentiates between local and instance variables
		this.age = age;  
		
	}
/**
 * 
 * @return
 */
	public String getName() {
		return name;
	}
/**
 * 
 * @param name
 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * 
 * @return
 */
	public int getAge() {
		return age;
	}
/**
 * 
 * @param age
 */
	public void setAge(int age) {
		this.age = age;
	}
	 
	public void sayHello () {
		System.out.println("hello my name is "+getName());
	}
		public void CelebrateBirthday ()  {
			++age;
			
			
		
	}
    
}

