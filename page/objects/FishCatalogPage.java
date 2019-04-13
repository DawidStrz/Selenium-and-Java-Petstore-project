package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FishCatalogPage {

    @FindBy(css = "#Catalog a[href*='FI-SW-01']")
    private WebElement angelfishInCatalog;

    public FishCatalogPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelFishInCatalog() {
        angelfishInCatalog.click();
    }

}

