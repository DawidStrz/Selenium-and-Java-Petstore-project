package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getLogger(LoginPage.class);

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement loginButton;

    @FindBy(css = ".messages>li")
    private WebElement messageLabel;


    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
    @Step("Type into User Name Field {userName}")
    public LoginPage typeIntoUserNameField(String userName) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(userName);
        logger.info("Typed into User Name Field {}", userName);
        return this;
    }
    @Step("Type into Password Name Field {password}")
    public LoginPage typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }
    @Step("Click on Login Button")
    public FooterPage clickOnLoginButton() {
        loginButton.click();
        logger.info("Clicked on Login Button");
        return new FooterPage();
    }
    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }
}
