package scenarios;

import config.ProjectProperties;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.GmailInboxPage;
import utils.MyCustomTestException;

public class GoogleTest extends BaseTest {

    private ProjectProperties properties = new ProjectProperties();
    @Test
    @Parameters({"email", "password"})
    public void loginIntoGoogleAccount(String email, String password) throws MyCustomTestException {
        gmailHomePage.enterEmail(email);
        GmailInboxPage inbox = gmailHomePage.enterPassword(password);
        Assert.assertTrue(inbox.isInboxButtonDisplayed(), "Inbox button is not found");
    }
}