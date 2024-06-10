package pages.admin.data_kajian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDataKajianObject {
    WebDriver driver;

    public AdminDataKajianObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTitleDataKajian() {
        return By.xpath("//*[contains(text(), 'Manajemen Kajian')]");
    }

    public By getButtonTambahDataKajian() {
        return By.xpath("//*[contains(text(), 'Tambah Data Kajian')]");
    }

    public By getSearchInput() {
        return By.xpath("//input[@placeholder='Search']");
    }


}
