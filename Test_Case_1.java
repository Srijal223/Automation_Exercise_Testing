package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_1 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com");
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        driver.quit();
    }
}