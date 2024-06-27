package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.comment.CommentPage;
import pages.profile.ProfilePage;

public class AddCommentsStepDef {
    public static WebDriver driver;
    public static ProfilePage profilePage;
    public static CommentPage commentPage;

    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
        commentPage = new CommentPage(driver);
    }

    @Given("user access portfolio details")
    public void userAccessesPortfolioDetails() {
        setupDriver();

        String url = "http://127.0.0.1:8000/TA/1";
        driver.get(url);
    }

    @When("user writes a comment")
    public void userWritesAComment() {
        commentPage.inputComment("kerenn abiezz");
    }

    @Then("user clicks Send button")
    public void userClicksSendButton() {
        commentPage.clickSend();

        String expectedUrl = "http://127.0.0.1:8000/TA/1";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

}
