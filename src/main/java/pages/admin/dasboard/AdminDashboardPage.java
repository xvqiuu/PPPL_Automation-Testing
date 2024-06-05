package pages.admin.dasboard;

import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {
    WebDriver driver;
    AdminDashboardObject adminDashboardObject;

    public AdminDashboardPage(WebDriver driver) {
        this.driver = driver;
        adminDashboardObject = new AdminDashboardObject(driver);
    }
}
