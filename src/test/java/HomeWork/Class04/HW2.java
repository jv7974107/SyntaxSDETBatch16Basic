package HomeWork.Class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
///        click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);
//     1.   find the element associate with the dropdown
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//        2.create an object of the select class and pass in the parameters the element dropdown
        Select sel = new Select(month);
        sel.selectByVisibleText("Apr");
        //Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel2= new Select(day);
        sel2.selectByValue("23");
        //Thread.sleep(2000);
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select sel3= new Select(year);
        sel3.selectByValue("1987");


    }
}
