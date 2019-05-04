package page.objects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class FooterPage {

    private Logger logger = LogManager.getLogger(FooterPage.class);

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement footerBanner;

    public FooterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
    @Step("Getting is dog banner is displayed")
    public boolean isBannerAfterLoginDisplayed() {
        WaitForElement.waitUntilElementIsVisible(footerBanner);
        boolean isDisplayed = footerBanner.isDisplayed();
        logger.info("Returning status of banner after login: {}",isDisplayed);
        return isDisplayed;
    }

}
