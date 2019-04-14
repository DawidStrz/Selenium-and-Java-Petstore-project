package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertTrue;

public class FailedCheckoutTests extends TestBase {

    @Test
    public void failedTryToBuyFishWithoutSignOn() {
        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage
                .clickOnFishQuickLink()
                .clickOnAngelFishInCatalog()
                .addSmallAngelfishToCart()
                .proceedToCheckoutButton();
        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();

        assertTrue(warningMessage.contains("You must sign on before attempting to check out."));
    }

}
