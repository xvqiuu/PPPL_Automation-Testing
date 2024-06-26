package pages.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileObject {
    WebDriver driver;

    public ProfileObject (WebDriver driver){
        this.driver = driver;
    }

    public By getIconProfile() {
        return By.xpath("//a[contains(@href, 'user')]");
    }

    public By getIconEditProfile() {
        return By.xpath("//*[contains(text(),’Edit Profil’)]");
    }

    public By getInputLastName() {
        return By.id("last-name");
    }

    public By getButtonSave() {
        return By.xpath("/html/body/div[2]/main/div/div/form/div[5]/button");
    }
}
