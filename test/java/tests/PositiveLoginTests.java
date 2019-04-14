package tests;

import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {


    @Test
    public void asUserTryToLogInWithValidLoginAndPassword() {
        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        FooterPage footerPage = new FooterPage();

        assertTrue(footerPage.isBannerAfterLoginDisplayed());
    }

}