package scenarios;

import com.codeborne.selenide.WebDriverRunner;
import config.ProjectProperties;
import org.testng.annotations.AfterTest;
import pages.GmailHomePage;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {

    protected GmailHomePage gmailHomePage;

    static {
        new ProjectProperties();
    }

    public BaseTest() {
        gmailHomePage = open(ProjectProperties.getBaseUrl(), GmailHomePage.class);
    }

    @Step("Clear cache.")
    @AfterTest(alwaysRun = true)
    protected void clearCache() {
        WebDriverRunner.clearBrowserCache();
    }
}
