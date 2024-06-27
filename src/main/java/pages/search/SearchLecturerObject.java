package pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchLecturerObject {
    WebDriver driver;

    public SearchLecturerObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getReadMoreButton() {
        return By.xpath("/html/body/div[2]/main/div[8]/div[1]/div[2]/button/p");
    }

    public By getSearchLecturer() {
        return By.id("lecturer");
    }

    public By getIconSearch() {
        return By.xpath("//*[@id=\"search_bar\"]/div");
    }
}
