package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;
import pages.profile.ProfilePage;

import static stepDefinitions.LoginStepDef.login;

public class LogoutStepDef {
    public static WebDriver driver;
    public static ProfilePage profilePage;
    public static LoginPage loginPage;

    @Given("user is on the profil page")
    public void userIsOnTheLandingPage() {
        driver = Hooks.getDriver();
        profilePage = new ProfilePage(driver);

        String url = "http://127.0.0.1:8000/user/";
        driver.get(url);
    }

    @When("user click Logout button")
    public void userClickLogoutButton() throws InterruptedException {
        profilePage.clickLogout();

        Hooks.test.info("User clicked on logout button");
    }

    @Then("landing page show up")
    public void landingPageShowUp() {
        loginPage = new LoginPage(driver);
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
