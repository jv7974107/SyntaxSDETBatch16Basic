package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com/");

        //click on create new account
        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        //because the DOM doesn't have firstName by default
        // it only shows up after you click
        Thread.sleep(2000);

        // enter the first name
        WebElement fname= driver.findElement(By.cssSelector("input[name='firstname']"));
        fname.sendKeys("Jose");

        WebElement closePopUp= driver.findElement(By.cssSelector("img[src$='Gm8t.png']"));
        closePopUp.click();
    }
}
