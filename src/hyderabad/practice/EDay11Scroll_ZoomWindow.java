package hyderabad.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EDay11Scroll_ZoomWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		JavaScriptExecutor js = (JavaScriptExecutor)driver;
		
		js.executeScript("window.scroll(0,500)");

		js.executeScript("window.scrollBy(0,-600)");

		String zoom = "document.body.style.zoom = '130%'";
		js.executeScript(zoom);
	
		/*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * SumLine test = new SumLine("5 8 3 2 1"); System.out.println(test.getSum()); }
		 */
	}

}
