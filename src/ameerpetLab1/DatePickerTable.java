package ameerpetLab1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DatePickerTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		driver.findElement(By.id("dob")).click();
		Thread.sleep(3000);
		Select se = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		se.selectByVisibleText("1992");
		Select sel = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		sel.selectByVisibleText("Sep");
		String date = "25";
		System.out.println(driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/td")).getText());
//		List<WebElement> allDates = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/td"));
//        for(WebElement ele:allDates) {
//        	//String dt =ele.getText();
//        	if(ele.getText().equals(date))
//        		ele.click();
//        	break;
//        }
	}
}
