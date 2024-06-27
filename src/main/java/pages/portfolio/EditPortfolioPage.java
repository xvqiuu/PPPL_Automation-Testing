package pages.portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.profile.ProfileObject;

import java.time.Duration;

public class EditPortfolioPage {
    WebDriver driver;
    EditPortfolioObject editPortfolioObject;
    WebDriverWait wait;

    public EditPortfolioPage(WebDriver driver) {
        this.driver = driver;
        profileObject = new ProfileObject(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clearInput() {
        driver.findElement(editPortfolioObject.getInputVideoTitle()).clear();
    }

    public void inputVideoTitle(String videotitle) {
        driver.findElement(editPortfolioObject.getInputVideoTitle()).sendKeys(videotitle);
    }

    public void saveEditingPortfolio() {
        driver.findElement(editPortfolioObject.getSaveEditingPortfolio()).click();
    }
}
