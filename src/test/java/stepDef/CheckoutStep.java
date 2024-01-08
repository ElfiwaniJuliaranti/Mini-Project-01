package stepDef;
import static pages.CheckoutPage.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutStep {
    @When("^User fill valid username and password$")
    public void userFillValidUsernameAndPassword() {
        inputLoginData();
    }

    @Then("^User navigate to homepage$")
    public void userNavigateToHomepage() {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Products')]"))
        );
    }

    @When("^User click add to cart$")
    public void userClickAddToCart() {
        clickAddToCart();
    }

    @And("^User click cart$")
    public void userClickCart() {
        clickCartButton();
    }

    @Then("^User navigate to cartpage$")
    public void userNavigateToCartpage() {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Your Cart')]"))
        );
    }

    @When("^User click checkout$")
    public void userClickCheckout() {
        clickCheckoutButton();
    }

    @Then("^User navigate to checkout step one page$")
    public void userNavigateToCheckoutStepOnePage() {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Checkout: Your Information')]"))
        );
    }

    @When("^User input data$")
    public void userInputData() {
        inputDataCheckout();
    }

    @And("^User click continue button$")
    public void userClickContinueButton() {
        clickContinue();
    }

    @Then("^User navigate to checkout step two$")
    public void userNavigateToCheckoutStepTwo() {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Checkout: Overview')]"))
        );
    }

    @When("^User click finish$")
    public void userClickFinish() {
        clickFinish();
    }

    @Then("^User finished checkout$")
    public void userFinishedCheckout() {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Checkout: Complete!')]"))
        );
    }
}
