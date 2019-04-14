package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.*;

import static navigation.ApplicationURLs.ANGELFISH_URL;
import static org.testng.Assert.assertTrue;

public class FailedCheckoutTests extends TestBase {

    @Test
    public void failedTryToBuyFishWithoutSignOn() {
        DriverUtils.navigateToPage(ANGELFISH_URL);

        AngelFishPage angelFishPage = new AngelFishPage();
        angelFishPage
                .addSmallAngelfishToCart()
                .proceedToCheckoutButton();

        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();

        assertTrue(warningMessage.contains("You must sign on before attempting to check out."));
    }

}
