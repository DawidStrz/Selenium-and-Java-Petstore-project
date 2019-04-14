package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelFishPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a.Button[href*='EST-2']")
    private WebElement smallAngelfish;

    public AngelFishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void addSmallAngelfishToCart() {
        smallAngelfish.click();
        logger.info("Small Angel Fish Added");
    }
}
