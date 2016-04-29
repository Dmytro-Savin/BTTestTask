package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.ProjectProperties;
import ru.yandex.qatools.allure.annotations.Step;
import utils.MyCustomTestException;

import java.net.URL;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GmailHomePage extends BasePage {

    public GmailHomePage() {
        super(ProjectProperties.getBaseUrl());
    }

    /*
    Please, note this is one of the options how elements could be defined in Selenide pageobjects.
    There is still a 'classic' webdriver way of locating elements using @FindBy annotation, e.g.

    @FindBy(how = How.ID, using = "Email")
    private SelenideElement email;

    However, I decided not to use it because it won't be possible to use Selenide locators in that case.
     */

    // Element getters

    public SelenideElement getTextboxEmail() { return $("#Email"); }

    public SelenideElement getTextboxPassword() { return $(byId("Passwd")); }

    public SelenideElement getButtonNext() { return $("#Next"); }

    // Actions

    @Step("Enter email and submit it.")
    public void enterEmail(String email) throws MyCustomTestException {
        validateElementDisplayed(getTextboxEmail());
        getTextboxEmail().setValue(email).submit();
    }

    @Step("Enter password and submit it.")
    public GmailInboxPage enterPassword(String password) throws MyCustomTestException {
        validateElementDisplayed(getTextboxPassword());
        getTextboxPassword().setValue(password).submit();
        return page(GmailInboxPage.class);
    }
}
