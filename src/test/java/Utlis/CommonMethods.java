package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String URL, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;

        }
        // maximize the window
        driver.manage().window().maximize();
        // navigate to the url
        driver.get(URL);

        }
        public static void closeBrowser(){
        if (driver!=null){
            driver.quit();
        }
        }
    }
