package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FishCatalogPage {

    private Logger logger = LogManager.getLogger(FishCatalogPage.class);

    @FindBy(css = "#Catalog a[href*='FI-SW-01']")
    private WebElement angelfishInCatalog;

    public FishCatalogPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelFishPage clickOnAngelFishInCatalog() {
        angelfishInCatalog.click();
        logger.info("Clicked on Angel Fish in catalog");
        return new AngelFishPage();
    }

}

