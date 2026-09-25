package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_3 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com");
        
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Srijal Silaniwal");
        
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Silaniwal@gmail.com");
        
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Srijal@321");
        
        driver.findElement(By.xpath("//option[@value='29']")).click();
        
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/div/div[2]/div/select/option[12]")).click();
        
        driver.findElement(By.xpath("//option[@value='2006']")).click();
        
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Srijal");
        
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Silaniwal");
        
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Automation Exercize");
        
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Abesit college main gate ");
        
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("same");
        
        driver.findElement(By.xpath("//option[@value='India']")).click();
        
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Delhi");
        
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Delhi");
        
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("110051");
        
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9315842901");
        
        driver.findElement(By.xpath(" //button[@data-qa='create-account']")).click();
       
     
//        driver.quit();
    }
}
