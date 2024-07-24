package hyderabad.prctoice3;

import org.testng.annotations.*;

public class ExceptionHandling {

	@Test(expectedExceptions = NumberFormatException.class)
	public void Test(){
	String s = "test";
	
	//we cannot convert into parseInt, will get NumberFormatException
	//To through the exception use (expectedExceptions = NumberFormatException.class)
	//NumberFormatException - if the string does not contain a parsable integer.
	Integer.parseInt(s);
	System.out.println(s);
	}
}
