package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_4 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com");
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("Silaniwal@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Srijal@321");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//        driver.quit();
    }
}
