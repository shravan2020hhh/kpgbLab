package hyderabad.prctoice3;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//String tab1 = driver.getWindowHandle();
		System.out.println("tab1111  ");
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		//String tab2 = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("httpd://www.foundit.in/");
		String tab3 = driver.getWindowHandle();
		
		//Used Set becoz it will not allow duplicates but List allow Dupliactes
		Set<String> tabs =  driver.getWindowHandles();
		Iterator<String> iterator = tabs.iterator();
				
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		String child1 = iterator.next();
		driver.switchTo().window(child1);
//		while(iterator.hasNext()) {
//			driver.switchTo().window(iterator.next());
//			Thread.sleep(2000);
//		}
//		
//		System.out.println(driver.switchTo().window(tab2).getTitle());
		//Thread.sleep(3000);
		System.out.println("tab111122  ");
		driver.quit();
	}

}
