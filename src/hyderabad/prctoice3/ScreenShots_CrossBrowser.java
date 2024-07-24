package hyderabad.prctoice3;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShots_CrossBrowser {
	static WebDriver driver;
	public static void crossBr() throws IOException {
		//WebDriver driver = new ChromeDriver();
		TakesScreenshot sc = (TakesScreenshot)driver;
		//take and store screenshot
		File sorceFile = sc.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\srava\\Downloads\\Screenshots\\screenshot45.png");
		//Save Screenshot to desirable loacation
		FileUtils.copyFile(sorceFile, destFile);
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		ScreenShots_CrossBrowser.crossBr();
		System.out.println("j");
		driver.quit();

		WebDriver edge = new EdgeDriver();
		edge.get("https://www.amazon.in/");
		Thread.sleep(2000);
		ScreenShots_CrossBrowser.crossBr();
		System.out.println("h");
		driver.quit();

//		TakesScreenshot sc = (TakesScreenshot)driver;
//		//take and store screenshot
//		File sorceFile = sc.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("C:\\Users\\srava\\Downloads\\Screenshots\\screenshot.png");
//		//Save Screenshot to desirable loacation
//		FileUtils.copyFile(sorceFile, destFile);
		
//		System.out.println(driver.getTitle());
//		System.out.println("h");
		//driver.quit();
	}

}
