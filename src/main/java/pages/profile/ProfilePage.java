package pages.profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {
    WebDriver driver;
    ProfileObject profileObject;
    WebDriverWait wait;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        profileObject = new ProfileObject(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickIconProfile() throws InterruptedException {
        driver.findElement(profileObject.getIconProfile()).click();
    }

    public void clickIconEditProfile() {
        driver.findElement(profileObject.getIconEditProfile()).click();
    }

    public void clearName() {
        driver.findElement(profileObject.getInputFirstName()).clear();
        driver.findElement(profileObject.getInputLastName()).clear();
    }

    public void inputFirstName(String firstname) {
        driver.findElement(profileObject.getInputFirstName()).sendKeys(firstname);
    }
    public void inputLastName(String lastname) {
        driver.findElement(profileObject.getInputLastName()).sendKeys(lastname);
    }

    public void clickSave() {
        driver.findElement(profileObject.getButtonSave()).click();
    }

    public void clickLogout() {
        driver.findElement(profileObject.getButtonLogout()).click();
    }
}

