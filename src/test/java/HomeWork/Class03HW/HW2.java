package HomeWork.Class03HW;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
        loginButton.click();
        WebElement message = driver.findElement(By.cssSelector("[id='spanMessage']"));
        String text= message.getText();
        System.out.println(text);

    }

}
