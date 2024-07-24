package hyderabad.prctoice3;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethods {
	WebDriver driver = new ChromeDriver();

	public void Test() {
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();

	}

	
	public void robotClassMethod() throws AWTException {
		//Different click actions
		WebElement uploadButton = driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
		Actions act = new Actions(driver);
		//act.click(uploadButton).build().perform();
		//act.clickAndHold(uploadButton).build().perform();
		//act.clickAndHold(uploadButton).release().perform();
		//act.contextClick(uploadButton).build().perform();
		//act.doubleClick(uploadButton).build().perform();
		uploadButton.click();
		WebElement button = driver.findElement(By.id("file-upload"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);//click action on button
	
		
}}
