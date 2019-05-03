package driver.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverEventListenerRegistrar {
    public synchronized static WebDriver registerWebDriverEventListener(WebDriver webDriver){
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(webDriver);
        DriverEventListener driverEventListener = new DriverEventListener();
        return eventFiringWebDriver.register(driverEventListener);
    }
}
