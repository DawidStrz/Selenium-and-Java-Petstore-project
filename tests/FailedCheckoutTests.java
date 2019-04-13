package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertTrue;

public class FailedCheckoutTests extends TestBase {

    @Test
    public void failedTryToBuyFishWithoutSignOn() {
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnFishQuickLink();

        FishCatalogPage fishCatalogPage = new FishCatalogPage(driver);
        fishCatalogPage.clickOnAngelFishInCatalog();

        AngelFishPage angelFishPage = new AngelFishPage(driver);
        angelFishPage.addSmallAngelfishToCart();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToCheckoutButton();

        LoginPage loginPage = new LoginPage(driver);
        String warningMessage = loginPage.getWarningMessage();

        assertTrue(warningMessage.contains("You must sign on before attempting to check out."));
    }

}
