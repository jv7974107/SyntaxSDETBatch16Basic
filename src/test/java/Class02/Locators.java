package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        // finds the element username TextBox
       /* WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        */
        //they both are same
       // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
       userNameTextBox.sendKeys("Amin");
       //after sending the username to the text box clear the txt box
        Thread.sleep(2000);
       userNameTextBox.clear();
       //sending the username again
        userNameTextBox.sendKeys("Admin");
        // find the password
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        // find the login button
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();
        //get the welcome message
        WebElement message=driver.findElement(By.linkText("Welcome Admin"));
        String text= message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();







    }
}
