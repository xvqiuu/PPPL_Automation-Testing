package pages.admin.dasboard;

import org.openqa.selenium.WebDriver;

public class AdminDashboardObject {
    WebDriver driver;

    public AdminDashboardObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
