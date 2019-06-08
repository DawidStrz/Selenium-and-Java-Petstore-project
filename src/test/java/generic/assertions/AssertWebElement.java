package generic.assertions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;
import org.openqa.selenium.WebElement;


public class AssertWebElement extends AbstractAssert<AssertWebElement, WebElement> {

    private Logger logger = LogManager.getLogger(AssertWebElement.class);

    public AssertWebElement(WebElement webElement) {
        super(webElement, AssertWebElement.class);
    }

    public static AssertWebElement assertThat(WebElement webElement) {
        return new AssertWebElement(webElement);
    }

    public AssertWebElement isDisplayed() {
        logger.info("Checking if element is displayed");
        isNotNull();

        if (!actual.isDisplayed()) {
            failWithMessage("\nExpecting that actual WebElement is displayed but is not.");
        }
        logger.info("WebElement was displayed");
        // return the current assertion for method chaining
        return this;
    }

    public AssertWebElement hasText(String expectedTextValue) {
        logger.info("Checking if WebElement has text:" + expectedTextValue);
        isNotNull();

        String assertjErrorMessage = "\nExpecting text of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        String actualText = actual.getText();
        if (!Objects.areEqual(actualText, expectedTextValue)) {
            failWithMessage(assertjErrorMessage, actual, expectedTextValue, actualText);
        }
        logger.info("WebElement had expected text");
        return this;
    }
}
