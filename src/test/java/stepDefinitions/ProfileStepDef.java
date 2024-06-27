package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.profile.ProfilePage;

public class ProfileStepDef {
    public static WebDriver driver;
    public static ProfilePage profilePage;

    @Given("user is on the landing page")
    public void userIsOnTheLandingPage() {
        driver = Hooks.getDriver();
        profilePage = new ProfilePage(driver);

        String url = "http://127.0.0.1:8000/";
        driver.get(url);
    }

    @When("user click profile")
    public void userClickProfile() throws InterruptedException {
        profilePage.clickIconProfile();
        Hooks.test.info("User clicked on profile icon");
    }

    @And("profile page show up")
    public void profilePageShowUp() {
        String currentUrl = driver.getCurrentUrl();
        try {
            assert currentUrl.contains("profile");
            Hooks.test.pass("Profile page displayed successfully");
        } catch (AssertionError e) {
            Hooks.test.fail("Failed to display profile page: " + e.getMessage());
        }
    }

    @Then("user edits profile")
    public void userEditsProfile() {
        profilePage.clickIconEditProfile();
        profilePage.clearName();
        profilePage.inputFirstName("Annisa");
        profilePage.inputLastName("Urohmah");
    }

    @And("user click save")
    public void userClickSave() {
        profilePage.clickSave();
        String currentUrl = driver.getCurrentUrl();
        try {
            assert currentUrl.contains("profile");
            Hooks.test.pass("Profile edited successfully");
        } catch (AssertionError e) {
            Hooks.test.fail("Failed to edit profile: " + e.getMessage());
        }
    }

}
