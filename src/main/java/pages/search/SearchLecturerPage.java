package pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchLecturerPage {
    WebDriver driver;
    SearchLecturerObject searchObject;
    WebDriverWait wait;

    public SearchLecturerPage(WebDriver driver) {
        this.driver = driver;
        searchObject = new SearchLecturerObject(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickReadMoreButton() {
        driver.findElement(searchObject.getReadMoreButton()).click();
    }


    public void inputSearchLecturer(String search) {
        driver.findElement(searchObject.getSearchLecturer()).sendKeys(search);
    }

    public void clickSearch() {
        driver.findElement(searchObject.getIconSearch()).click();
    }
}
