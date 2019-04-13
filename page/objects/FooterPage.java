package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {
    private WebDriver driver;

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement footerBanner;

    public FooterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isBannerAfterLoginDisplayed() {
        boolean isDisplayed = footerBanner.isDisplayed();
        return isDisplayed;
    }

}
