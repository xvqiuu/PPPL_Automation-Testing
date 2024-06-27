package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;
import pages.profile.ProfilePage;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {
    public static WebDriver driver;
    public static LoginPage login;
    public static ProfilePage profile;


    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        setupDriver();

        String url = "http://127.0.0.1:8000/index/";
        driver.get(url);

        Hooks.test.log(Status.INFO,"Open browser at Login Page");

    }

    @When("the user enters valid credentials as {string} and {string}")
    public void theUserEntersValidCredentials(String email, String password) throws InterruptedException {
        login = new LoginPage(driver);
        login.inputEmail(email);
        login.inputPassword(password);
        login.clickSubmit();

        profile = new ProfilePage(driver);

        Hooks.test.log(Status.INFO,"Login with valid credentials");
    }

    @Then("the user is redirected to the landing page")
    public void theUserIsRedirectedToTheLandingPage() throws InterruptedException {
        String actualURL = login.getDriver().getCurrentUrl();

        try {
            assert actualURL.contains("/index");
            Hooks.test.log(
                    Status.FAIL,
                    "Failed to redirect to the landing page. Expected URL contain: "
            );
        } catch (AssertionError e) {
            Hooks.test.log(Status.PASS,"Redirected to the landing page");
        }
    }

}
