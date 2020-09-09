package main;
/**
 * Class manipulates a String
 * @author kathleen malone
 *
 */
public class MyCustomString {
	
	String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}
		
	/**
	 * Replaces all digits in the String with the given character
	 * Eg. the call replaceAllDigits('X')
	 * String "Dog456Dog" would become "DogXXXDog"
	 * @param c
	 */
	public void replaceAllDigits(char c) {
		//create new String character by character
		String temp="";
		for(int i=0;i<myString.length();i++) {
			if(Character.isDigit(myString.charAt(i))) {
				temp+=Character.toString(c);
			} else {
				temp+=Character.toString(myString.charAt(i));
			}
		}
		myString=temp;		
	}
	
	/**
	 * Remove all non alphabetic characters in the String
	 * Eg. the call removeAllNonCharacters()
	 * String "Dog456Dog" would become "DogDog"
	 */
	public void removeAllNonCharacters() {
		String temp="";
		for(int i=0;i<myString.length();i++) {
			if(Character.isLetter(myString.charAt(i))) {
				temp+=Character.toString(myString.charAt(i)).toLowerCase();
			} 
		}
		myString=temp;			
	}
	

	/**
	 * Remove all trailing non characters in the String
	 * Eg. the call removeAllNonCharacters()
	 * String "Dog456Dog!" would become "Dog456Dog"
	 * String "Dog456Dog@*..." would become "Dog456Dog"
	 */
	public void removeTrailingNonCharacters() {		
		if(!Character.isLetter(myString.charAt(myString.length()-1)) ) {
		    myString=myString.toLowerCase();
		    myString=myString.substring(0,myString.length()-1);
		}
	}
}

//
