package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.Source;
public class TestCase{
	   
	String message = "Hello World";	
	Source main = new Source(message);
	Source sum = new Source(2,3);

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals("Result: ",main.printMessage(),message);
	   }
	   
	   @Test
	   public void testSum() {
		   assertEquals("Sum: ",5,sum.sum());
	   }
}
