package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelFishPage {

    @FindBy(css = "a.Button[href*='EST-2']")
    private WebElement smallAngelfish;

    public AngelFishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void addSmallAngelfishToCart() {
        smallAngelfish.click();
    }
}
