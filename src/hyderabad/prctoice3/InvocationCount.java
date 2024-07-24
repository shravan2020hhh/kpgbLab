package hyderabad.prctoice3;

import org.testng.annotations.*;


public class InvocationCount {
	
	//print answer 7 times
	@Test(invocationCount = 7)
	public void Test() {
		int a=3;
		int b=4;
		int c=a+b;
		System.out.println("sum---  "+c);
	}

}
