package HomeWork.Class05;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        /*
        click on check box
        then select bay cat from drop down
        then enter text in text box
         */
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        //WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        //System.out.println(animal.getText());

        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel= new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.xpath("/html/body/input"));
        text.sendKeys("Hello World");

    }
}
