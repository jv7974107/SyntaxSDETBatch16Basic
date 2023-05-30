package HomeWork.Class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01HW {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Jose");
        driver.findElement(By.id("customer.lastName")).sendKeys("Valdes");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Fake St.");
        driver.findElement(By.name("customer.address.city")).sendKeys("Lakeville");
        driver.findElement(By.name("customer.address.state")).sendKeys("Minnesota");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("55044");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("(123) 678-4478");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-678");
        driver.findElement(By.name("customer.username")).sendKeys("JV23");
        driver.findElement(By.name("customer.password")).sendKeys("Password");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Password");
        driver.quit();






    }
}
