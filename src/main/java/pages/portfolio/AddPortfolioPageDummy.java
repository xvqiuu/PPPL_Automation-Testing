package pages.portfolio;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddPortfolioPageDummy {
    WebDriver driver;
    AddPortfolioObject addPortfolioObject;

    public AddPortfolioPageDummy (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Given("user click add portfolio button")
    public void user_click_add_portfolio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user completes the required data")
    public void user_completes_the_required_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click save portfolio button")
    public void user_click_save_portfolio_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
