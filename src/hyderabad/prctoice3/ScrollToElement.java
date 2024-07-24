package hyderabad.prctoice3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
//		//click method
//		WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Mobiles')]"));
//		js.executeScript("arguments[0].click();", mobile);
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Summer Essentials')]"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(3000);
		System.out.println("success");
	}

}
