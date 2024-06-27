package pages.portfoliodetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortfolioObject {
    WebDriver driver;

    public PortfolioObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getShowcaseButton() {
        return By.xpath("//*[@id=\"navbarCollapse\"]/button[2]");
    }

    public By getPortfolio() {
        return By.xpath("//*[@id=\"item_content\"]/div[1]/p[2]");
    }


}
