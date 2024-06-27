package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.comment.CommentPage;
import pages.portfoliodetails.PortfolioPage;
import pages.profile.ProfilePage;

public class AddCommentsStepDef {
    public static WebDriver driver;
    public static ProfilePage profilePage;
    public static CommentPage commentPage;

    @Given("user access porfolio details")
    public void userAccessesTheLandingPage() {
        driver = Hooks.getDriver();
        profilePage = new ProfilePage(driver);

        String url = "http://127.0.0.1:8000/TA/2";
        driver.get(url);
    }

    @When("user writes a comment")
    public void userWritesAComment() {
        commentPage.inputComment("wowww kerenn :)");
    }

    @Then("user clicks Send button")
    public void userClicksSendButton() {
        commentPage.clickSend();

        String expectedUrl = "http://127.0.0.1:8000/TA/2";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

}
