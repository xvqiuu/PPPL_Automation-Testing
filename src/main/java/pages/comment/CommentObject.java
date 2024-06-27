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
        return By.xpath("/html/body/div[2]/main/main/div[8]/div/div[5]/form/button");
    }
}
