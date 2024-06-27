package pages.portfolio;

import org.openqa.selenium.WebDriver;

public class AddPortfolioPage {
    WebDriver driver;
    AddPortfolioObject addPortfolioObject;

    public AddPortfolioPage (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickAddPortfolioButton() {
        driver.findElement(addPortfolioObject.getAddPortfolioButton()).click();
    }

    public void uploadPicture(String picturePath ) {
        driver.findElement(addPortfolioObject.getUploadPicture()).sendKeys(picturePath);
    }

    public void inputVideoTitle(String title) {
        driver.findElement(addPortfolioObject.getInputVideoTitle()).sendKeys(title);
    }

    public void inputVideoUrl(String url) {
        driver.findElement(addPortfolioObject.getInputVideoUrl()).sendKeys(url);
    }

    public void uploadPaper(String paperPath) {
        driver.findElement(addPortfolioObject.getUploadPaper()).sendKeys(paperPath);
    }

    public void clickSavePortfolio() {
        driver.findElement(addPortfolioObject.getSavePortfolioButton()).click();
    }
}
