package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.portfoliodetails.PortfolioPage;

public class PortfolioDetailsStepDef {
    public static WebDriver driver;
    public static PortfolioPage portfolioPage;

    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
        portfolioPage = new PortfolioPage(driver);
    }

    @Given("user accesses the landing page")
    public void userAccessesTheLandingPage() {
        setupDriver();

        String url = "http://127.0.0.1:8000/";
        driver.get(url);

        Hooks.test.log(Status.INFO,"Open browser at Landing Page");

    }

    @And("user clicks the Showcase Button")
    public void userClicksTheShowcaseButton() {
        portfolioPage.clickShowcaseButton();
    }

    @When("user clicks one of the portfolios")
    public void userClicksOneOfThePortfolios() {
        portfolioPage.clickPortfolio();
    }

    @Then("portfolio details should be displayed")
    public void portfolioDetailsShouldBeDisplayed() {
        String expectedUrl = "http://127.0.0.1:8000/TA/1";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

}
