package hyderabad.prctoice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessModeTest {

	public static void main(String[] args) {
		// here we are using chromedriver with chromeoptions to enable headless mode
		ChromeOptions options = new ChromeOptions();
		// instruct chrome to run headless mode
		options.addArguments("--headless");
		// disable the GPU to prevent some issues.
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("httpd://www.foundit.in/");
		System.out.println("Succcess");
		
	}

}
