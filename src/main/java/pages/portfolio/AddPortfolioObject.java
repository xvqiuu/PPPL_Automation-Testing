package pages.portfolio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPortfolioObject {
    WebDriver driver;

    public AddPortfolioObject (WebDriver driver){
        this.driver = driver;
    }

    public By getAddPortfolioButton() {
        return By.id("submit_portfolio");
    }

    public By getUploadPicture(){
        return By.id("fileInput1");
    }

    public By getInputVideoTitle(){
        return By.id("video_tittle");
    }

    public By getInputVideoUrl() {
        return By.id("video_url");
    }

    public By getUploadPaper() {
        return By.id("fileInput");
    }

    public By getSavePortfolioButton() {
        return By.xpath("/html/body/div[2]/main/div/div/form/div[11]/button");
    }
}
