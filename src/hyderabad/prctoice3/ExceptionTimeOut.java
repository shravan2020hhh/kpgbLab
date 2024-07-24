package hyderabad.prctoice3;

import org.testng.annotations.*;

public class ExceptionTimeOut {

	@Test(invocationTimeOut = 2000)
	public void Test() {
		int i = 1;
		while (i == 1) {
			System.out.println("ExceptionTimeOutHandling"+i);
		}
	}

}
