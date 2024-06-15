package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.admin.dasboard.AdminDashboardPage;
import pages.admin.data_user.AdminDataUserPage;
import pages.login.LoginPage;

import static org.junit.Assert.assertTrue;

public class ManagementUserDataStepDef {
    static WebDriver driver;
    static AdminDashboardPage dashboard;
    static AdminDataUserPage adminDataUserPage;

    @BeforeAll
    void setUp() {
        driver = Hooks.getDriver();
        if (dashboard == null) {
            dashboard = new AdminDashboardPage(driver);
        }
        if (adminDataUserPage == null) {
            adminDataUserPage = new AdminDataUserPage(driver);
        }

        Hooks.test.log(Status.INFO, "Setup Driver on ManagementUserDataStepDef");
    }

    @Given("a web browser is at the Dashboard Admin Panel MWCC")
    public void a_web_browser_is_at_the_dashboard_admin_panel_mwcc() throws InterruptedException {
        setUp();
        String actualURL = dashboard.getURL();
        String containURL = "admin";

        assertTrue(actualURL.contains(containURL));

        Hooks.test.log(Status.INFO, "Open browser at Dashboard Admin Panel MWCC");
    }

    @When("the users clicks the Data User on the side menu")
    public void theUsersClicksTheDataUserOnTheSideMenu() {
        adminDataUserPage.clickMenuDataUser();

        Hooks.test.log(Status.INFO, "Click Data User on the side menu");
    }

    @Then("list of users are shown on the result page")
    public void listOfUsersAreShownOnTheResultPage() {
        adminDataUserPage.isOnPage();
        adminDataUserPage.isTableDataUserVisible();
        adminDataUserPage.isTitleDataUserVisible();

        Hooks.test.log(Status.INFO, "List of users are shown on the result page");
    }

    @Given("a web browser is at the Data User page")
    public void aWebBrowserIsAtTheDataUserPage() {
        driver.get("https://dev.mwcc.masmoendigital.store/admin");
        adminDataUserPage.clickMenuDataUser();

        Hooks.test.log(Status.INFO, "Open browser at Data User page");
    }


    @When("the user enter {string} on the search bar")
    public void theUserEnterOnTheSearchBar(String string) {
        adminDataUserPage.putSearchInput(string);

        Hooks.test.log(Status.INFO, "Enter " + string + " on the search bar");
    }

    @Then("user that the name contain {string} shown on the result page")
    public void userThatTheNameContainShownOnTheResultPage(String string) {
        adminDataUserPage.isSearchResultVisible(string);

        Hooks.test.log(Status.INFO, "User that the name contain " + string + " shown on the result page");
    }

    @When("the user click one of the eye icon on the user item")
    public void theUserClickOneOfTheEyeIconOnTheUserItem() {
        adminDataUserPage.clickUserDetail(0);

        Hooks.test.log(Status.INFO, "Click one of the eye icon on the user item");
    }

    @Then("a detail of the selected user is shown on the result page")
    public void aDetailOfTheSelectedUserIsShownOnTheResultPage() {
        adminDataUserPage.isOnDetailUserPage();

        Hooks.test.log(Status.INFO, "Detail of the selected user is shown on the result page");
    }

    @Given("a web browser is at the Data User Detail page")
    public void aWebBrowserIsAtTheDataUserDetailPage() {
        adminDataUserPage.clickMenuDataUser();
        adminDataUserPage.clickUserDetail(0);

        Hooks.test.log(Status.INFO, "Open browser at Data User Detail page");
    }

    @When("the user click one of the pen icon on the user item")
    public void theUserClickOneOfThePenIconOnTheUserItem() {
        adminDataUserPage.clickEditIconUserDetail();

        Hooks.test.log(Status.INFO, "Click one of the pen icon on the user item");
    }

    @Then("a pre-filled form related to the user is shown")
    public void aPreFilledFormRelatedToTheUserIsShown() {
        adminDataUserPage.isOnDetailUserEditFormPage();

        Hooks.test.log(Status.INFO, "Pre-filled form related to the user is shown");
    }


}
