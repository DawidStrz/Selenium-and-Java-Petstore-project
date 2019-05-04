package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getLogger(TopMenuPage.class);

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signInLink;

    @FindBy(css = "#QuickLinks a[href*='FISH']")
    private WebElement fishQuickLink;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signInLink);
        signInLink.click();
        logger.info("Clicked on Sign In Link");
        return new LoginPage();
    }

    @Step("Click on Fish Quick Link")
    public FishCatalogPage clickOnFishQuickLink() {
        WaitForElement.waitUntilElementIsClickable(fishQuickLink);
        fishQuickLink.click();
        logger.info("Clicked on Fish Quick Link");
        return new FishCatalogPage();
    }
}
