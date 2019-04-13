package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {
    private WebDriver driver;

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    @FindBy(css = "#QuickLinks a[href*='FISH']")
    WebElement fishQuickLink;

    public TopMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignInLink() {
        signInLink.click();
    }

    public void clickOnFishQuickLink() {
        fishQuickLink.click();
    }
}
