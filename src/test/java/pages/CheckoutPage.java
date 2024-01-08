package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class CheckoutPage extends BrowserDriver {
    public static String usernameField = "user-name";
    public static String passwordField = "password";
    public static String addToCartButton = "add-to-cart-sauce-labs-backpack";
    public static String cartButton = "//*[@id='shopping_cart_container']/a";
    public static String checkoutButton = "checkout";
    public static String firstNameField = "first-name";
    public static String lastNameField = "last-name";
    public static String postalCode = "postal-code";
    public static String continueButton = "continue";
    public static String finishButton = "finish";


    public static void inputLoginData(){
        driver.findElement(By.name(usernameField)).sendKeys("standard_user");
        driver.findElement(By.id(passwordField)).sendKeys("secret_sauce");
    }
    public static void clickAddToCart(){
        driver.findElement(By.name(addToCartButton)).click();
    }
    public static void clickCartButton(){
        driver.findElement(By.xpath(cartButton)).click();
    }
    public static void clickCheckoutButton(){
        driver.findElement(By.id(checkoutButton)).click();
    }
    public static void inputDataCheckout(){
        driver.findElement(By.id(firstNameField)).sendKeys("Fazh");
        driver.findElement(By.id(lastNameField)).sendKeys("Nicole");
        driver.findElement(By.id(postalCode)).sendKeys("2010380");
    }
    public static void clickContinue(){
        driver.findElement(By.id(continueButton)).click();
    }
    public static void clickFinish(){
        driver.findElement(By.id(finishButton)).click();
    }
}
