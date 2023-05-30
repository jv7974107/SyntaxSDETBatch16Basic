package HomeWork.Class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facbook.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.name());


    }
}
