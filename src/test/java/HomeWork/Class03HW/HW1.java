package HomeWork.Class03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement fName= driver.findElement(By.cssSelector("input[name='first_name']"));
        fName.sendKeys("Jose");
        WebElement lName= driver.findElement(By.cssSelector("input[name='last_name']"));
        lName.sendKeys("Valdez");
        WebElement email= driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("Jose@gmail.com");
        WebElement phoneNum= driver.findElement(By.cssSelector("input[name='phone']"));
        phoneNum.sendKeys("678 123 4565");
        WebElement address= driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("123 Fake St.");
        WebElement city= driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Lakeville");
        WebElement stateDropDown= driver.findElement(By.cssSelector("[name='state']"));
        stateDropDown.click();
        Thread.sleep(2000);
        Select dropdown=new Select(stateDropDown);
        Thread.sleep(2000);
        dropdown.selectByVisibleText("Minnesota");
        WebElement zip= driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("55044");
        WebElement webSite= driver.findElement(By.cssSelector("input[name='website']"));
        webSite.sendKeys("www.google.com");
        WebElement radiobtn=driver.findElement(By.cssSelector("input[value='no']"));
        radiobtn.click();
        WebElement projectDescripiton= driver.findElement(By.cssSelector("[data-bv-field='comment']"));
        projectDescripiton.sendKeys("School is fun to learn");


    }
}
