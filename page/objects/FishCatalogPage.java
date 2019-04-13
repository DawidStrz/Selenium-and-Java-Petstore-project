package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishCatalogPage {
    private WebDriver driver;

    @FindBy(css = "#Catalog a[href*='FI-SW-01']")
    WebElement angelfishInCatalog;

    public FishCatalogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAngelFishInCatalog() {
        angelfishInCatalog.click();
    }

}

