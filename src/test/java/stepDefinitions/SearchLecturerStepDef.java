package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.portfoliodetails.PortfolioPage;
import pages.search.SearchLecturerPage;

public class SearchLecturerStepDef {
    public static WebDriver driver;
    public static SearchLecturerPage searchLecturerPage;
    public static PortfolioPage portfolioPage;

    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
        searchLecturerPage = new SearchLecturerPage(driver);
        portfolioPage = new PortfolioPage(driver);
    }

    @Given("user clicks the Read More Button")
    public void userClicksTheReadMoreButton() {
        searchLecturerPage.clickReadMoreButton();
    }

    @When("user input lecturer by name")
    public void userInputLecturerByName() {
        searchLecturerPage.inputSearchLecturer("raden");
        searchLecturerPage.clickSearch();
    }

    @Then("lecturer should be displayed")
    public void lecturerShouldBeDisplayed() {
        String expectedUrl = "http://127.0.0.1:8000/team?query=raden";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

}
