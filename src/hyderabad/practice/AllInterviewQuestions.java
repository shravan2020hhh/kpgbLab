package hyderabad.practice;

public class AllInterviewQuestions {
	/*
	 * Limitations of selenium framework 
	 * selenium junit annotations 
	 * can we handle window popup and web popup
	 * types of selenium framework
	 * robot class
	 * select dropdown value
	 * assert and verify difference
	 * frame 
	 */
	
	/*
	 * 1> what is webdriverManager---->>is a java library designed to simplify the mng.of webdriver binary(like chromeDriver, GeckoDriver,etc).
	 * 2> String str = "java, selenium, python, java, python";---->>(find duplicate words).
	 * 3> volatile keywords---->>It allows multi thread env. to modify value simultaneously.
	 * 4> reflection---->>The ability to inspect and manipulate classes, methods, fields at run time.
	 * 5> what is super interface class webdriver/webElements----->>SearchContext() 
	 * 6> Singleton---->>restricts the instantiation of a class and ensures that only one instance of the class exists. 
	 * 7> if object is not found then findelement what exception show---->>NoSuchElementEXception
	 */
	
	
	/*
	 * Done-->without using sendkeys pass the data in selenium -->(JavaScriptExecutor)---js.("arguments[0].click();",element)
	 * Done-->Parallel execution
	 * Done-->without using put can we create data using get method-->Using GET to create data is not considered a standard or RESTful practice
	 * Done-->hard/soft assert-->{below}
	 * -A hard assertion is a strict assertion that, when it fails, immediately terminates the test case or test method. It does not allow the 
	 * -subsequent steps in the test to execute.( Assert.assertEquals(actualValue, expectedValue);)
	 * -A soft assertion-- is a flexible assertion that collects multiple assertion failures throughout the test execution rather than stopping at 
	 * -the first failure. It allows the test to continue running, and at the end of the test, it reports all the failures together.
	 * -SoftAssertions softAssert = new SoftAssertions();
	 * -softAssert.assertThat(actualValue2).isEqualTo(expectedValue2);
     * -softAssert.assertAll();
	 * Done-->what is POM model approach
	 * Done-->error code -->{}
	 * -Checked Exceptions(CompileTime Exception):IOException, SQLException, and ClassNotFoundException.
	 * -Unchecked Exceptions(Runtime Exceptions):NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException
	 * Done-->payload --data you want to send to an API for various purposes, such as creating, updating, or retrieving resources.
	 * Done-->what is assertion --done(Debugging, Documentation, Testing)
	 * Done-->methods of select class/option method
	 * Done-->mutltifactor authentication(MFA)/two-factor authentication (2FA)/two-step verification:is a security process that requires 
	 * -users to provide two or more separate authentication factors to verify their identity before gaining access to a system, application, or online account.  
	 * Done-->options method in api testing:{below}
	 * -The HTTP OPTIONS method in API testing is used to request information about the communication options
	 * -available for a given resource or the server itself. It is primarily used to inquire about the allowed 
	 * -HTTP methods, headers, authentication methods, and other communication details that the server supports 
	 * -for a particular resource or endpoint.
	 * Done-->resource interest in api-->(Resource URI, Resource Representation, Resource Access Control)
	 * Done-->what is explicit and implicit wait and how used
	 * Done-->staleElement Exception
	 */

	
	/*
	 * can we overload contructor ? why ?
	 * how to restrict override
	 * can list allow duplicate
	 * write program to remove duplicates from list
	 * webdriver and chromedriver difference
	 * list class or interface
	 * low severity high priority
	 * severity and priority difference
	 * call parent methods from child class object creation
	 * difference between get("url") and navigate("url") 
	 * 
	 * */
	
	
	class A
	{
		public A()
		{
			
		}
		public A(int a)
		{
			
		}
		public A(String a)
		{
			System.out.println();
		}
		void ma()
		{
			
		}
	}
	class B extend A
	{
		
		public B(int a)
		{
		  super();	
		}
		void m2()
		{
			super.ma();
		}
		
		public main()
		{
			A a =new B();
			a.m1();
		}
	}


}
