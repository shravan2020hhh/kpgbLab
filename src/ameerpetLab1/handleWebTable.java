package ameerpetLab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();

		//Adding new value to table
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("salary")).sendKeys("25000");
		driver.findElement(By.id("department")).sendKeys("HR");
		driver.findElement(By.id("submit")).click();

		//Printing and counting the newely added table data
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div"));
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).getText().isBlank()) {
				System.out.println("text : " + list.get(i).getText());
				count++;
			}

		}
		System.out.println("Total : " + list.size());
		System.out.println("Present Data Count : " + count);

		//validating the newely added table data
		String[] expected = { "abc", "xyz", "25", "abc@gmail.com", "25000", "HR" };
		//List<String> list2 = new ArrayList<String>(Arrays.asList(expected));
		List<WebElement> list1 = driver.findElements(By.xpath("(//div[@class='rt-tr -even'])[2]/div"));
		System.out.println("size :" + list1.size());
		for (int i = 0; i < list1.size() - 1; i++) {
			String actValue = list1.get(i).getText();
			//if(actValue.equals(list2.get(i)))
			if(actValue.equals(expected[i]))
				System.out.println("Table data matched");
			else
				System.out.println("Table data Not matched");
		}
		driver.quit();
	}

}
