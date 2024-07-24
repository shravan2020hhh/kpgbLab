package hyderabad.prctoice3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// Accept and getText---------------------
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.accept();
		// driver.close();

		// accept and dismiss
		WebDriver edge = new EdgeDriver();
		edge.get("https://the-internet.herokuapp.com/javascript_alerts");
		edge.manage().window().maximize();
		edge.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert a1 = edge.switchTo().alert();
		System.out.println(a1.getText());
		// edge.switchTo().alert().accept();//close alert by clicking Ok button
		edge.switchTo().alert().dismiss();// close alert by clicking cancel button
		edge.quit();

		// handle alert by entering value
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		System.out.println(a.getText());
		// driver.switchTo().alert().sendKeys("Testing");
		a.sendKeys("Testing");
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		

	}

}
