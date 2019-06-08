package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FishCatalogPage extends BasePage{

    @FindBy(css = "#Catalog a[href*='FI-SW-01']")
    private WebElement angelfishInCatalog;

    public AngelFishPage clickOnAngelFishInCatalog() {
        angelfishInCatalog.click();
        log().info("Clicked on Angel Fish in catalog");
        return new AngelFishPage();
    }

}

