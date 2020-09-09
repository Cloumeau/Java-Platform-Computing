
public class PersonTester {
public static void main(String[] args) {
	
	
	Person p = new Person("Chris",19);
	p.sayHello();
	System.out.println(p.getName()+ " is " +p.getAge()+ " years old.");
	p.CelebrateBirthday();
	System.out.println(p.getName()+ " is " +p.getAge()+ " years old");
	
	
}
}
