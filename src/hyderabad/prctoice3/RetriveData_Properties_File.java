package hyderabad.prctoice3;

import java.io.*;
import java.util.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveData_Properties_File {

	public static void main(String[] args) throws IOException{
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		properties.load(fis);
		String url = properties.getProperty("url");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
//		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("mobiles");
//		System.out.println("success");
//		driver.quit();
		
		Properties prop = new Properties();
		FileInputStream fis1 = new FileInputStream("config.properties");
		prop.load(fis1);
		String url1 = prop.getProperty("url");
		WebDriver driver1 = new ChromeDriver();
		driver1.get(url1);
		
	}
	


}
