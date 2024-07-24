package hyderabad.prctoice3;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browse_UploadFile {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void Test() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();

	}

	@Test
	public void BrowseFile() {
		//driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		// Using SendKeys (when type attribute value is file in html)
		// driver.findElement(By.id("file-upload")).sendKeys("C:\\Downloads\\mendies.pdf");
	}

	@Test
	public void robotClassMethod() throws AWTException {
		//Using Robot class method 
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		//Click Action with JavaScript executor
		WebElement button = driver.findElement(By.id("file-upload"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);//click action on button
		
		/*
		 1> copy file path
		 2> CTRL +V
		 3> ENTER
		 */
		
		Robot rb =new Robot();
		rb.delay(2000);
		
		//Put file path to clipboard
		StringSelection filePath =new StringSelection("C:\\Downloads\\mendies.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		rb.delay(2000);
		//CTRL +V
		rb.keyPress(KeyEvent.VK_CONTROL);//Press on control key 
		rb.keyPress(KeyEvent.VK_V);//Press on V key
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);//Release control key
		rb.keyRelease(KeyEvent.VK_V);//Release V key
		rb.delay(2000);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	
	}
}
