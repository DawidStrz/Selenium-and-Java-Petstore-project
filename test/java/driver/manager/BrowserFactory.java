package driver.manager;

import configuration.LocalWebDriverProperties;
import configuration.TestRunProperties;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    private static final String MESSAGE_UNKNOWN_BROWSER = "Unknown browser type. Check your configuration.";

    private BrowserType browserType;

    private boolean isRemoteRun;

    public BrowserFactory(BrowserType browserType, boolean isRemoteRun) {
        this.browserType = browserType;
        this.isRemoteRun = isRemoteRun;
    }

    public WebDriver getBrowser() {
        if (isRemoteRun) {

            MutableCapabilities mutableCapabilities = new MutableCapabilities();

            switch (browserType) {
                case CHROME:

                    ChromeOptions chromeOptions = new ChromeOptions();

                    chromeOptions.addArguments("start-maximized");

                    return getRemoteWebDriver(chromeOptions);

                case FIREFOX:

                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    return getRemoteWebDriver(firefoxOptions);

                case IE:
                    InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
                    return getRemoteWebDriver(internetExplorerOptions);

                default:
                    throw new IllegalStateException(MESSAGE_UNKNOWN_BROWSER);
            }
        } else {

            switch (browserType) {
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", LocalWebDriverProperties.getChromeWebDriverLocation());
                    return new ChromeDriver();
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", LocalWebDriverProperties.getFirefoxWebDriverLocation());
                    return new FirefoxDriver();
                case IE:
                    System.setProperty("webdriver.ie.driver", LocalWebDriverProperties.getInternetExplorerWebDriverLocation());
                    return new InternetExplorerDriver();
                default:
                    throw new IllegalStateException(MESSAGE_UNKNOWN_BROWSER);
            }
        }
    }
        private WebDriver getRemoteWebDriver(MutableCapabilities mutableCapabilities){
            RemoteWebDriver remoteWebDriver = null;
            try {
                remoteWebDriver = new RemoteWebDriver(new URL(TestRunProperties.getGridUrl()),mutableCapabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to create RemoteWebDriver due to:" + e.getMessage());
            }
            return remoteWebDriver;
        }
}
