package page.objects;

import generic.assertions.AssertWebElement;
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

    @Step("Assert that element dog banner is displayed")
    public FooterPage assertThatDogBannerIsDisplayed() {
        logger.info("Checking if dog banner is displayed");
        WaitForElement.waitUntilElementIsVisible(footerBanner);
        AssertWebElement.assertThat(footerBanner).isDisplayed();
        return this;
    }

}
