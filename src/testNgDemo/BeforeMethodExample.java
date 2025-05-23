package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodExample {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    //    String driverPath = "C:\\sele\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver;

    @Test
    public void verifyHomepageTitle() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
//      driver.close();

    }
}

