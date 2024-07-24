package hyderbadHostel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// to open 1st page
		driver.navigate().to("https://www.globalsqa.com");
		//driver.navigate().to("https://www.facebook.com/");

		// to get text from the web element
		WebElement home_element = driver.findElement(By.xpath("//*[@id=\"menu-item-51137\"]/a"));
		String element = home_element.getText();
		
		js.executeScript("window.open('https://www.google.com','_blank');");
		js.executeScript("window.open('https://www.facebook.com','_blank');");

		//To switch to new window
		for (String windowHandle : driver.getWindowHandles()) {
			System.out.println(windowHandle);
			driver.switchTo().window(windowHandle);
		}

		// to move to another page where we have to drop
		driver.get("https://www.google.com/");
		
		// to drop the text in search bar
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(element);
//		driver.quit();
	}
}