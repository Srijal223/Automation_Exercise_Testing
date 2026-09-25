package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_2 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com");
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Srijal Silaniwal");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Silaniwal@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.quit();
    }
}
