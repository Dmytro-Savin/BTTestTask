package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import utils.MyCustomTestException;

import java.net.URL;

public class BasePage {

    private URL currentPage;

    public BasePage(URL url) {
        currentPage = url;
    }

    /**
     * Validates if a given element is currently displayed, and throws an exception if it's not.
     *
     * @param element SelenideElement element to be checked if it is displayed.
     * @throws MyCustomTestException
     */
    protected void validateElementDisplayed(SelenideElement element) throws MyCustomTestException {
        if (!element.shouldBe(Condition.visible).isDisplayed()) {
            throw new MyCustomTestException(String.format("The element %s is not available", element.toString()));
        }
    }
}
