package hyderbadHostel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// Instance variable can use inside the block
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//div[@id='content']/div/ul/li[3]/button")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("vipulSharma");
		
		
		
	}

}
