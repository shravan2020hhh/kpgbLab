package hyderabad.practice;
import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

import java.io.*;

public class Day4DropDownValidate {

	public static void main(String[] args) {
		//WebDriverManager.chromeDriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\com.demo\\Resources\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("amazon.com");
		String[] expected = { "sdfdsf", "sdfdsf" };
		WebElement dropdownValue = driver.findelement(By.xpath("sdf"));
		Select sl = new Select(dropdownValue);

		List<WebElement> value = sl.getOptions();

		for (int i = 0; i < value.size(); i++) {
			assertEquals(value.get(i).getText(), expected[i]);
		}
		System.out.println("success");

	}
}
