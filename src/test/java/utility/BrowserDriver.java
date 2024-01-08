package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;
    protected String baseUrl = "https://www.saucedemo.com/";

    public BrowserDriver(){
        options = new ChromeOptions();
        System.setProperty("webdriver.chrome,driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        driver.get(baseUrl);
    }
}
