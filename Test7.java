package automation_exercize;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();

        // driver.quit();
    }
}