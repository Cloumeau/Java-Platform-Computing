/**
 * CHris LOumeau
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MyCustomString;

public class MyCustomStringTest {
	
	MyCustomString myCustomString;
	
	@BeforeEach
	public void setUp() {
		myCustomString=new MyCustomString();
	}
	
	//Test Purpose: tests basic functionality
	@Test
	public void replaceAllDigitsTest1() {
		myCustomString.setMyString("Dog456Dog");
		myCustomString.replaceAllDigits('X');
		assertEquals("DogXXXDog", myCustomString.getMyString());	
	}	
	
	//Test Purpose: tests String remains unchanged if String does not have digits
	@Test
	public void replaceAllDigitsTest2() {
		myCustomString.setMyString("DogDog");
		myCustomString.replaceAllDigits('X');
		assertEquals("DogDog", myCustomString.getMyString());	
	}	
	
	//Test Purpose: tests basic functionality
	@Test
	public void removeAllNonCharactersTest1() {
		myCustomString.setMyString("dog456dog");
		myCustomString.removeAllNonCharacters();
		assertEquals("dogdog", myCustomString.getMyString());		
	}
	
	//Test Purpose: test that method handles a trailing non character		
	@Test
	public void removeTrailingNonCharactersTest1() {
		
		myCustomString.setMyString("dog456dog!");
		myCustomString.removeTrailingNonCharacters();
		assertEquals("dog456dog", myCustomString.getMyString());
	}
	//Test Purpose: That remove all Characters has a bug, and to show that it only works with lowercase letters, so we implmented a cpaitol letter d to fail the test
		@Test
		public void removeAllNonCharactersTestbug() {
			myCustomString.setMyString("Do!g456Dog!");
			myCustomString.removeAllNonCharacters();
			assertEquals("DogDog", myCustomString.getMyString());		
		}
		//Test Purpose: That remove trailing characters has a bug, it does not work with capitol letters, so we implemented a capitol letter G   to fail the test	
		@Test
		public void removeTrailingNonCharactersTestbug() {
			
			myCustomString.setMyString("doG456doG!");
			myCustomString.removeTrailingNonCharacters();
			assertEquals("doG456doG", myCustomString.getMyString());
		}
	
}

	

