package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AngelFishPage extends BasePage{

    @FindBy(css = "a.Button[href*='EST-2']")
    private WebElement smallAngelfish;

    public ShoppingCartPage addSmallAngelfishToCart() {
        smallAngelfish.click();
        log().info("Small Angel Fish Added");
        return new ShoppingCartPage();
    }
}
