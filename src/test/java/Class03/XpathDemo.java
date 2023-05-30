package Class03;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        // instance of the webDriver
        WebDriver driver=new ChromeDriver();
        //driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        // userName text box through Xpath
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        //password textBox
        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        // login button
        WebElement loginButton= driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
        loginButton.click();
        // click on pimTab
        WebElement pimTab= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimTab.click();




    }
}
