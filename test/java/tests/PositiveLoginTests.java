package tests;

import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {


    @Test
    public void asUserTryToLogInWithValidLoginAndPassword() {
        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage
                .clickOnSignInLink()
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton();
        FooterPage footerPage = new FooterPage();

        assertTrue(footerPage.isBannerAfterLoginDisplayed());
    }

}
