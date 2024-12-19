package Tests.TestCase21;

import Config.Config;
import PageObjects.AddReview.AddReviewActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddReview extends TestBase{
    HomePageActions homePageActions;
    AddReviewActions addreviewactions;
    NavBarActions navBarActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        addreviewactions = new AddReviewActions(driver);

    }
    public void NavigateToUrl() {homePageActions.navigateToHomePage(url);}

    @Test
    public void AddReviewTest() {

        NavigateToUrl();
        String userName = Utilities.generateRandomString(7);
        String email = Utilities.generateRandomString(7) + "@gmail.com";
        String review = Utilities.generateRandomString(100);

        navBarActions.clickProductButton();
        addreviewactions.validateAllProductsHeaderIsDisplayed();
        addreviewactions.clickViewProductButton();
        addreviewactions.validateWriteYourReviewTitleIsDisplayed();
        addreviewactions.enterUserNameInput(userName);
        addreviewactions.UserEmailInput(email);
        addreviewactions.UserReviewInput(review);
        addreviewactions.clickSubmitButton();


    }
}