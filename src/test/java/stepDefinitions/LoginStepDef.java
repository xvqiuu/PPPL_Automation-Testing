package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {
    static WebDriver driver;
    static LoginPage login;


    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        setupDriver();
        String url = "https://dev.mwcc.masmoendigital.store/login";
        driver.get(url);

        Hooks.test.log(Status.INFO,"Open browser at Login Page");

    }

    @When("the user enters valid credentials as {string} and {string}")
    public void the_user_enters_valid_credentials(String email, String password) throws InterruptedException {
        String dashboardUrl = "https://dev.mwcc.masmoendigital.store/admin/dashboard";
        if (driver.getCurrentUrl().contains("https://dev.mwcc.masmoendigital.store/login")) {
            login = new LoginPage(driver);
            login.putEmail(email);
            login.putPassword(password);
            login.clickSubmit();

            Hooks.test.log(Status.INFO,"Login with valid credentials");
        } else {
            driver.get(dashboardUrl);

            Hooks.test.log(Status.INFO,"Open browser at Dashboard Admin Panel MWCC");
        }
    }

    @Then("the user is redirected to the {string} dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page(String type) throws InterruptedException {
        String containURL = (Objects.equals(type, "admin")) ?
                "/admin" : "/";
        String actualURL = login.getDriver().getCurrentUrl();

        try {
            assert actualURL.contains(containURL);
            Hooks.test.log(Status.PASS,"Redirected to the dashboard page");
        } catch (AssertionError e) {
            Hooks.test.log(
                    Status.FAIL,
                    "Failed to redirect to the dashboard page. Expected URL contain: " +
                            containURL + ", but was: " + actualURL
            );
        }
    }

}
