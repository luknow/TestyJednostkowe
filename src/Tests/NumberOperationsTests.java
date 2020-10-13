package Tests;  
 
import static org.junit.Assert.*;

import org.junit.Test;

import Logic.NumberOperations;  

public class NumberOperationsTests {

	  @Test  
	    public void testFindMax(){  
	        assertEquals(4,NumberOperations.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,NumberOperations.findMax(new int[]{-12,-1,-3,-4,-2}));
	        assertTrue(NumberOperations.findMax(new int[]{1,3,4,2}) > NumberOperations.findMax(new int[]{-12,-1,-3,-4,-2}));
	    }  
	  
	  @Test  
	    public void testPowerOfTwo(){  
	        assertEquals(4,NumberOperations.powerOfTwo(2));  
	        assertEquals(4,NumberOperations.powerOfTwo(-2)); 
	        assertTrue(NumberOperations.powerOfTwo(2) == NumberOperations.powerOfTwo(-2));
	    } 
	  
	  @Test  
	    public void testIsPositive(){  
		    assertEquals(false,NumberOperations.isPositive(-2));
		    assertEquals(true,NumberOperations.isPositive(2));
	    } 
	  
	  @Test  
	    public void testFibonacci(){  
		    assertEquals(8,NumberOperations.Fibonacci(6));
		    assertNotNull(NumberOperations.Fibonacci(-1));
		    assertEquals(1,NumberOperations.Fibonacci(-1));
	    } 
}
