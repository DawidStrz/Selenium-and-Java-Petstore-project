package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.objects.LandingPage;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
