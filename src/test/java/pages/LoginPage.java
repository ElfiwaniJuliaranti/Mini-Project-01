package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String userNameData = "user-name";
    public static String passwordData = "password";
    public static String loginButton = "login-button";

    public static void inputData( String username, String password){
        driver.findElement(By.name(userNameData)).sendKeys(username);
        driver.findElement(By.id(passwordData)).sendKeys(password);
    }
    public static void click_login_btn(){
        driver.findElement(By.id(loginButton)).click();
    }
}
