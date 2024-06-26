package pages.login;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginObject loginObject;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginObject = new LoginObject(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void inputEmail(String email) {
        driver.findElement(loginObject.getInputEmail()).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(loginObject.getInputPassword()).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(loginObject.getButtonSubmit()).click();
    }
}
