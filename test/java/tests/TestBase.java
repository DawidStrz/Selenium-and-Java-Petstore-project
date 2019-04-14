package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.objects.LandingPage;

public class TestBase {

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }
}
