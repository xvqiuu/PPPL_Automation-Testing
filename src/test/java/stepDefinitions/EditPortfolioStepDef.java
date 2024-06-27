package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.portfolio.EditPortfolioPage;
import pages.profile.ProfilePage;

public class EditPortfolioStepDef {
    public static WebDriver driver;
    EditPortfolioPage editPortfolioPage;
    ProfilePage profilePage;

    @Given("user click Edit Portfolio button")
    public void userClickEditPortfolioButton() {
        driver = Hooks.getDriver();
        editPortfolioPage = new EditPortfolioPage(driver);

        String url = "http://127.0.0.1:8000/user/";
        driver.get(url);

        profilePage.clickEditPortfolio();
    }

    @When("user editing portfolio")
    public void userEditingPortfolio() {
        editPortfolioPage.clearInput();
        editPortfolioPage.inputVideoTitle("Video Lexica AR VR");
    }

    @And("user click save edit portfolio button")
    public void userClickSaveEditPortfolioButton() {
        editPortfolioPage.saveEditingPortfolio();

    }

    @Then("profile page should be displayed")
    public void profilePageShouldBeDisplayed() {
        String expectedUrl = "http://127.0.0.1:8000/user";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}
