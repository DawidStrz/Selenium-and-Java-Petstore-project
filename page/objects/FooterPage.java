package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FooterPage {

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement footerBanner;

    public FooterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerAfterLoginDisplayed() {
        boolean isDisplayed = footerBanner.isDisplayed();
        return isDisplayed;
    }

}
