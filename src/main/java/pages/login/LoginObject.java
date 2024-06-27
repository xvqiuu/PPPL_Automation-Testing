package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;

    public LoginObject (WebDriver driver){
        this.driver = driver;
    }

    public By getInputEmail() {
        return By.id("email");
    }

    public By getInputPassword() {
        return By.id("password");
    }

    public By getButtonSubmit() {
        return By.xpath("/html/body/div/div/div/div[2]/form/div[4]/button");
    }

}
