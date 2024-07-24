package hyderbadHosteJavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Click {
	static WebDriver driver = new ChromeDriver();// global variable can access ANYWHERE

	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();// Instance variable can use inside the block
			driver.get("https://www.flipkart.com/");
			// driver.findElement(By.xpath("//a[@title='Login']/span")).click();

			// Locate all span elements using cssSelector
			List<WebElement> spans = driver.findElements(By.cssSelector("span"));

			// Iterate through the list to find the one with text "Login"
			for (WebElement span : spans) {
				if ("Login".equals(span.getText())) {
					// Perform the desired action, e.g., clicking the span
					span.click();
					break;
				}
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement login = driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']"));
			js.executeScript("arguments[0].value='srvana';", login);
			WebElement submit = driver.findElement(By.xpath("//form[@autocomplete='on']/div[3]/button"));
			js.executeScript("arguments[0].click();", submit);
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e);
		} finally {
			// Close the browser
			driver.quit();

		}
	}

}
