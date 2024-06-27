package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;
import pages.portfolio.AddPortfolioPage;
import pages.profile.ProfilePage;

public class AddPortfolioStepDef {
    public static WebDriver driver;
    public static ProfilePage profilePage;
    public static AddPortfolioPage addPortfolioPage;
    public static LoginPage loginPage;

    @Given("user click add portfolio button")
    public void user_click_add_portfolio_button() {
        driver = Hooks.getDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);

        String url = "http://127.0.0.1:8000/user/";
        driver.get(url);

        addPortfolioPage.clickAddPortfolioButton();
    }

    @When("user completes the required data")
    public void user_completes_the_required_data() {
        String picturePath = "D:/semester4/pppl/uas/profil.jpeg";
        String paperPath = "D:/semester4/pppl/uas/A_Conceptual_Framework_for_Serious_Games.pdf";

        addPortfolioPage.uploadPicture(picturePath);
        addPortfolioPage.inputVideoTitle("Video Demo Lexica AR VR");
        addPortfolioPage.inputVideoUrl("https://www.youtube.com/watch?v=tKj3QIdeokA");
        addPortfolioPage.uploadPaper(paperPath);

    }
    @Then("user click save portfolio button")
    public void user_click_save_portfolio_button() {
        addPortfolioPage.clickSavePortfolio();
    }

}
