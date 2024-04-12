package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.systeminfo.SystemInfo;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login {
    @Test
    public void tc1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com");
       Thread.sleep(2000);
       driver.close();
    }
}
