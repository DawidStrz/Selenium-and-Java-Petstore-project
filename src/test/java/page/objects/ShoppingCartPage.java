package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingCartPage extends BasePage{

    @FindBy(css = "a.Button[href*='newOrderForm']")
    private WebElement proceedToCheckoutButton;

    public void proceedToCheckoutButton() {
        proceedToCheckoutButton.click();
        log().info("Click on Proceed To Checkout Button");
    }

}
