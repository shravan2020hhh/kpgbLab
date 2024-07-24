package hyderabad.prctoice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverMethods {
	
	//MouseHoverMethods
	WebDriver driver = new ChromeDriver();
	WebElement drag = driver.findElement(By.xpath("//a[@href='/skillyst']"));
	Thread.sleep(2000);
	WebElement drop = driver.findElement(By.xpath("//input[@id='SE_home_autocomplete']"));
	Actions mouse = new Actions(driver);
	mouse.dragAndDrop(drag, drop).perform();

	WebElement rightClick = driver.findElement(By.xpath("//a[@href='/']"));
	mouse.contextClick(rightClick).pause(3000).perform();
	
	WebElement dropdown = driver.findElement(By.xpath("//div[@class='accordion-header']"));
	js.executeScript("window.scroll(0, 1500)");
	dropdown.click();
	Select lang = new Select(dropdown);
	lang.selectByIndex(2);
	lang.selectByVisibleText("Accounting");
	
}
