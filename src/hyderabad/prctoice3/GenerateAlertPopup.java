package hyderabad.prctoice3;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import scriptExecutorDemo.JavaScriptExecutor;

public class GenerateAlertPopup {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\com.demo\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		JavaScriptExecutor js = (JavaScriptExecutor) driver;
		js.executeScript("alert('Hello World')");
		try {
			driver.wait(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}}
