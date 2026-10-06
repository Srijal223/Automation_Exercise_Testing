package automation_exercize;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();


        driver.get("https://www.automationexercise.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();
        driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/form/input[2]")).sendKeys("ishan@gmail.com");
        driver.findElement(By.xpath("//button(@id='subscribe']")).click();

        // driver.quit();
    }
}