package driver.manager;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;
    private static final BrowserType BROWSER_TYPE = BrowserType.IE;

    private DriverManager(){
    }

    public static WebDriver getWebDriver(){

        if(driver==null){
            driver = BrowserFactory.getBrowser(BROWSER_TYPE);
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if(!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            driver.quit();
        }
        driver = null;
    }

}
