package HomeWork.Class05;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn.click();
        Alert alert=driver.switchTo().alert();
        //Thread.sleep(2000);
        alert.sendKeys("Hello World");
        alert.accept();


    }
}
