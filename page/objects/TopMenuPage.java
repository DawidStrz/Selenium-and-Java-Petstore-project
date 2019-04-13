package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class TopMenuPage {

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
    }

    public void clickOnFishQuickLink() {
        fishQuickLink.click();
    }
}
