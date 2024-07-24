package hyderabad.prctoice3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IncludeGrupsScenario {
	<groups>
		<run>
			<include name = "windows.regression"></include>
		</run>
	</groups>

	@Test(groups = {"windows.regression"})
	public void positiveTest() {
		SampleTest mt  = new SampleTest(); 
		Assert.assertEquals(1, mt.userLogin("abc", "abc@123"));
		
	}
	
	@Test(groups = {"linux.regression"})
	public void negetiveTest() {
		SampleTest mt  = new SampleTest(); 
		Assert.assertEquals(0, mt.userLogin("abc", "abc123"));
	}
}
