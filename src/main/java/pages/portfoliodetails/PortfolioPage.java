package pages.portfoliodetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PortfolioPage {
    WebDriver driver;
    PortfolioObject portfolioObject;
    WebDriverWait wait;

    public PortfolioPage(WebDriver driver) {
        this.driver = driver;
        portfolioObject = new PortfolioObject(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickShowcaseButton() {
        driver.findElement(portfolioObject.getShowcaseButton()).click();
    }

    public void clickPortfolio() {
        driver.findElement(portfolioObject.getPortfolio()).click();
    }

}
