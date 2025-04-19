package testingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckForm {
    public static void main(String[] args){
        System.setProperty("Webdriver.chrome.driver", "C:\\\\sele\\\\chrome-win64\\\\chrome-win64");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Gmail")).click();

    }

}
