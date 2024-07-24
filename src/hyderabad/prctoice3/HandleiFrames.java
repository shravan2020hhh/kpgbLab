package hyderabad.prctoice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://docs.oracle.com/javase/8/docs/api/");
//		WebElement frame = driver.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']"));
//		driver.switchTo().frame(frame);//Switch to frame by WebElement
////		driver.switchTo().frame("classFrame");////Switch to frame by name
//		driver.findElement(By.linkText("Description")).click();
				
		//Switch to frame by id
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);//Switch to frame by index
		//driver.switchTo().frame("mce_0_ifr");//Switch to frame by id
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("sravan");
	}

}
