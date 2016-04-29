package pages;

import com.codeborne.selenide.SelenideElement;
import config.ProjectProperties;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class GmailInboxPage extends BasePage {

    public GmailInboxPage() {
        super(ProjectProperties.getInboxUrl());
    }

    // Elements

    public SelenideElement getInboxButton() {
        return $(byAttribute("title", "Inbox"));
    }

    // Actions

    @Step("Check if the Inbox button is displayed.")
    public boolean isInboxButtonDisplayed() {
        return getInboxButton().isDisplayed();
    }
}
