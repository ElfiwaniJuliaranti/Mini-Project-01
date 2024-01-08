package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import static pages.LoginPage.*;

import java.time.Duration;

public class LoginStep extends BrowserDriver {

    @Given("^User in login page$")

        public void userIsLoginPage() {
            Duration duration = Duration.ofSeconds(10);
            WebDriverWait wait = new WebDriverWait(driver, duration);
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@data-test='login-button']"))
            );
        }

    @When("^User fill invalid (.*) and (.*)$")
    public void userFillInvalidAnd(String username, String password) {
        inputData(username, password);
    }

    @And("^User click login button$")
    public void userClickLoginButton() {
        click_login_btn();
    }

    @Then("^User get login (.*)$")
    public void userGetLogin(String result) {
        Duration duration = Duration.ofSeconds(100);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed") {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Products')]"))
            );
        } else if (result == "Failed") {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.className("error_button"))
            );
        }
        driver.quit();
    }


}
