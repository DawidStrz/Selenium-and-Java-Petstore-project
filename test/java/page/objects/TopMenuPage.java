package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class TopMenuPage extends BasePage{

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signInLink;

    @FindBy(css = "#QuickLinks a[href*='FISH']")
    private WebElement fishQuickLink;

    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signInLink);
        signInLink.click();
        log().info("Clicked on Sign In Link");
        return new LoginPage();
    }

    @Step("Click on Fish Quick Link")
    public FishCatalogPage clickOnFishQuickLink() {
        WaitForElement.waitUntilElementIsClickable(fishQuickLink);
        fishQuickLink.click();
        log().info("Clicked on Fish Quick Link");
        return new FishCatalogPage();
    }
}
