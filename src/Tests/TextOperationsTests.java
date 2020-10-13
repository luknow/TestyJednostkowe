package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.TextOperations;

public class TextOperationsTests {

	@Test  
    public void testIsPalindrome(){  
        assertEquals(true,TextOperations.isPalindrome("kajak"));  
        assertEquals(true,TextOperations.isPalindrome("Zakopane na pokaz")); 
        assertEquals(false,TextOperations.isPalindrome("Zakopane")); 
    } 
	
	@Test  
    public void testConcatenateTwoWords(){  
        assertEquals("Imie Nazwisko", TextOperations.concatenateTwoWords("Imie", "Nazwisko"));
        assertNotSame("Imie Nazwisko", TextOperations.concatenateTwoWords("Imie", "Nazwisko"));
        assertTrue("Imie Nazwisko".equals(TextOperations.concatenateTwoWords("Imie", "Nazwisko")));
        assertNotNull(TextOperations.concatenateTwoWords(null, "Nazwisko"));
    } 

}
