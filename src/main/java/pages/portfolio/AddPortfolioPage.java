package pages.portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.comment.CommentObject;

public class AddPortfolioPage {
    WebDriver driver;
    AddPortfolioObject addPortfolioObject;

    public AddPortfolioPage (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void uploadPicture(String ) {
        driver.findElement(addPortfolioObject.getUploadPicture()).sendKeys(comment);
    }

    public void inputVideoTitle(String title) {
        driver.findElement(commentObject.getButtonSend()).click();
    }



}
