package pages.portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPortfolioObject {
    WebDriver driver;

    public EditPortfolioObject (WebDriver driver){
        this.driver = driver;
    }

    public By getButtonEditPortfolio() {
        return By.id("edit_portfolio");
    }

    public By getInputVideoTitle() {
        return By.id("video-title");
    }

    public By getSaveEditingPortfolio() {
        return By.xpath("/html/body/div[2]/main/div/div/form/div[11]/button");
    }
}
