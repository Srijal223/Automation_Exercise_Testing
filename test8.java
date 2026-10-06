package automation_exercize;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("Ishan");
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("Ishan@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("Enquiry related products");
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Facing problem in maximize the quantity in the cart page or same with minimizeing the quantity");

        // driver.quit();
    }
}