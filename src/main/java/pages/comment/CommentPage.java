package pages.comment;

import org.openqa.selenium.WebDriver;

public class CommentPage {
    WebDriver driver;
    CommentObject commentObject;

    public CommentPage(WebDriver driver) {
        this.driver = driver;
        commentObject = new CommentObject(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void inputComment(String comment) {
        driver.findElement(commentObject.getInputComment()).sendKeys(comment);
    }

    public void clickSend() {
        driver.findElement(commentObject.getButtonSend()).click();
    }

}
