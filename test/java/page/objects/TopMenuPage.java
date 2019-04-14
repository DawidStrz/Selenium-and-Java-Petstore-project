package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signInLink;

    @FindBy(css = "#QuickLinks a[href*='FISH']")
    private WebElement fishQuickLink;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signInLink);
        signInLink.click();
        logger.info("Clicked on Enter Store Link");
    }

    public void clickOnFishQuickLink() {
        WaitForElement.waitUntilElementIsClickable(fishQuickLink);
        fishQuickLink.click();
        logger.info("Clicked on Enter Store Link");
    }
}
