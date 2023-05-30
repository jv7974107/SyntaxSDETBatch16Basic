package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        /**
         * task
         * navigate to google.com
         */
        //declare the instance
        WebDriver driver=new ChromeDriver();
        // use.get(url to navigate to the desired url)
        driver.get("https://www.google.com");
        //maximize the window
        driver.manage().window().maximize();
        // navigate to
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        //get the current url
        String currentURl=driver.getCurrentUrl();
        // print on the console
        System.out.println("The current url of the website is = "+currentURl);
        //get the title of the page
        String title=driver.getTitle();
        // print the title on the console
        System.out.println("the title of the page is = "+title);
        //add some wait time
        Thread.sleep(5000);
        //close the web browser
        driver.quit();
    }
}
