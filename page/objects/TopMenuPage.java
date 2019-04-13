package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class TopMenuPage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    @FindBy(css = "#QuickLinks a[href*='FISH']")
    WebElement fishQuickLink;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink() {
        signInLink.click();
    }

    public void clickOnFishQuickLink() {
        fishQuickLink.click();
    }
}
