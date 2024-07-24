package ameerpetLab1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "searchData")
    public Object[][] searchDataProvider() {
        return new Object[][] {
            {"TestNG"},
            {"Selenium"},
            {"DataProvider"}
        };
    }

    @Test(dataProvider = "searchData")
    public void searchTest(String searchTerm) {
        driver.get("https://www.google.com");
        // Code to perform search and verify results
        System.out.println("Searching for: " + searchTerm);
        // Add Selenium logic to interact with the search box and submit search
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}