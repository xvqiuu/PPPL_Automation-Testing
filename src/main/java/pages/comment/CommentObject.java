package pages.comment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommentObject {
    WebDriver driver;

    public CommentObject (WebDriver driver){
        this.driver = driver;
    }

    public By getInputComment() {
        return By.name("comment");
    }

    public By getButtonSend() {
        return By.id("kirim");
    }
}
