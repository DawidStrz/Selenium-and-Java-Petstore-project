package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.AngelFishPage;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.ANGELFISH_URL;

public class FailedCheckoutTests extends TestBase {

    @Test
    public void failedTryToBuyFishWithoutSignOn() {

        DriverUtils.navigateToPage(ANGELFISH_URL);

        AngelFishPage angelFishPage = new AngelFishPage();
        angelFishPage
                .addSmallAngelfishToCart()
                .proceedToCheckoutButton();

        LoginPage loginPage = new LoginPage();
        loginPage
                .assertThatWarningIsDisplayed("You must sign on before attempting to check out.");
    }

}
