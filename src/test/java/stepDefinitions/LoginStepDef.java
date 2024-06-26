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
    public void user_is_on_the_login_page() {
        setupDriver();

        String url = "http://127.0.0.1:8000/index/";
        driver.get(url);

        Hooks.test.log(Status.INFO,"Open browser at Login Page");

    }

    @When("the user enters valid credentials as {string} and {string}")
    public void the_user_enters_valid_credentials(String email, String password) throws InterruptedException {
        login = new LoginPage(driver);
        login.inputEmail(email);
        login.inputPassword(password);
        login.clickSubmit();

        profile = new ProfilePage(driver);

        Hooks.test.log(Status.INFO,"Login with valid credentials");
    }

    @Then("the user is redirected to the dashboard page")
    public void the_user_is_redirected_to_the_dashboard_page() throws InterruptedException {
        String actualURL = login.getDriver().getCurrentUrl();

        try {
            assert actualURL.contains("/index");
            Hooks.test.log(
                    Status.FAIL,
                    "Failed to redirect to the dashboard page. Expected URL contain: "
            );
        } catch (AssertionError e) {
            Hooks.test.log(Status.PASS,"Redirected to the dashboard page");
        }
    }

    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {
        String url = "http://127.0.0.1:8000/";
        driver.get(url);
    }

    @When("user click profile")
    public void userClickProfile() throws InterruptedException {
        profile.clickIconProfile();

        Hooks.test.info("lisa disini");
    }


    @Then("profile page show up")
    public void profilePageShowUp() {
        String currentUrl = profile.getDriver().getCurrentUrl();

        try {
            assert currentUrl.contains("profile");
            Hooks.test.pass("Berhasil menampilkan profile");
        } catch (Exception e) {
            Hooks.test.fail("Gagal " + e);
        }
    }
}
