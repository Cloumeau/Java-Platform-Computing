/**
 * 
 * @author c2lou
 *
 */
public class Contact {

String firstName;
String lastName;
String address;
String phoneNumber;


public Contact(String firstName, String lastName, String address, String phoneNumber) {
	super();
	this.firstName= firstName;
	this.lastName= lastName;
	this.address= address;
	this.phoneNumber= phoneNumber;
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String toString() {
		String s= getFirstName()+" "+getLastName()+"  "+getPhoneNumber();
		return s;
		
}
public boolean equals(Object o) {
	
	 
    Contact c = (Contact)o;
	if (this.getFirstName().equals(c.getFirstName())  && this.getLastName().equals(c.getLastName())  && this.getAddress().equals(c.getAddress()) && this.getPhoneNumber().contentEquals(c.getPhoneNumber())) {
        return true; }
    
   return false;
    
    
}
	
}
	




