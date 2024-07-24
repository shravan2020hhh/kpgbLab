package ameerpetLab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {
	public static void main(String[] args) throws InterruptedException {
		String expMonthYear = "August 2024";
		// String expDate = "28";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday : "+driver.getTitle());
		// Clcick on date picker tab
		driver.findElement(By.xpath("//p[@class='blackText font20 code lineHeight36']")).click();
		Thread.sleep(4000);
		while (true)// true will enters any condition
		{
			WebElement actMonthYear = driver.findElement(By.xpath("//div[@id='top-banner']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
			System.out.println("------ "+actMonthYear.getText());
			if (actMonthYear.getText().equalsIgnoreCase(expMonthYear))
				break;// once expected found will break the block
			else// if expdate not found will move to next month
				driver.findElement(By.xpath("//div[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		}
		driver.findElement(By.xpath("//div[text()='August 2024']//parent::div//parent::div//*[text()='15']")).click();
		Thread.sleep(2000);

	}
}
