package Tests.TestCase2;

import Config.Config;
import PageObjects.HomePage.HomePageActions;
import PageObjects.TestCase.TestCasesActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTestCasesPageTest extends TestBase {
    HomePageActions homePageActions;
    TestCasesActions testCasesActions;
    String url = Config.getProperty("URL");// URL for the test

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        testCasesActions = new TestCasesActions(driver);
    }

    @Test
    public void verifyTestCasesPage() {
        // Step 1 & 2: Navigate to the URL
        homePageActions.navigateToHomePage(url);

        // Step 3: Verify the homepage is visible successfully
        homePageActions.validateHomePageTitleIsDisplayed();

        // Step 4: Click on 'Test Cases' button
        testCasesActions.clickTestCasesButton();

        // Step 5: Verify user is navigated to the 'Test Cases' page successfully
        testCasesActions.validateTestCasesPageIsDisplayed();
    }
}
