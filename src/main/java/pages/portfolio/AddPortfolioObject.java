package pages.portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPortfolioObject {
    WebDriver driver;

    public AddPortfolioObject (WebDriver driver){
        this.driver = driver;
    }

    public By getAddPortfolioButton() {
        return By.xpath("/html/body/div[2]/main/div/div[2]/div/div/button");
    }

    public By getUploadPicture(){
        return By.id("fileUploadBox1");
    }

    public By getInputVideoTitle(){
        return By.id("video_tittle");
    }

    public By getInputVideoUrl() {
        return By.id("video_url");
    }

    public By getUploadPaper() {
        return By.id("fileUploadBox");
    }

    public By getSavePortfolioButton() {
        return By.id("/html/body/div[2]/main/div/div/form/div[11]/button");
    }
}
