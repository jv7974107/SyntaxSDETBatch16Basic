package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        //facebook.com
        driver.get("https://www.facebook.com/");
        //maxmuim window
        driver.manage().window().maximize();
        //send some txt in the email
        driver.findElement(By.id("email")).sendKeys("Josev@gmail.com");
        //send some txt to the password field
        driver.findElement(By.name("pass")).sendKeys("Password");
        //print url on the console
        String url=driver.getCurrentUrl();
        System.out.println(url);
        // print the title on the console
        String title=driver.getTitle();
        System.out.println(title);
        //confirm that the title is "Facebook - log in or sign up"
        if (title.equals("Facebook - log in or sign up")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }

        // close the browser
        driver.quit();

    }
}
