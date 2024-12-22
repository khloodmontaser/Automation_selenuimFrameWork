package Tests.TestCase23;
/*
* Still not fifnished
*
* */
import Assertions.Assertion;
import BrowserActions.BrowserActions;
import Config.Config;
import PageObjects.CartPage.CartPageActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.PaymentPage.PaymentPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import PageObjects.TRY_FIX.FIX_FIX;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAddressDetailsCheckoutPage extends TestBase {
    Assertion assertion;
    BrowserActions browserActions;
    String url = Config.getProperty("URL");

    HomePageActions homePageActions;
    NavBarActions navBarActions;
    SingUPLoginActions singUPLoginActions;
    FIX_FIX fixFix;

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        singUPLoginActions = new SingUPLoginActions(driver);
        fixFix = new FIX_FIX(driver);

//        cartPageActions = new CartPageActions(driver);
//        verifyProductActions = new VerifyProductActions(driver);
//        deleteAccountActions = new DeleteAccountActions(driver);
//        paymentPageActions = new PaymentPageActions(driver);

    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
@Test
    public void VerifyAddressDetails(){
        navigateToUrl();
        String Name = Utilities.generateRandomString(5);
        String EMAIL= Utilities.generateRandomString(3) + "@gmail.com";

        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickSignUpLoginButton();

        singUPLoginActions.enterSignUPNameInput(Name);
        singUPLoginActions.enterSignUPEmailInput(EMAIL);
        singUPLoginActions.clickSignUpButton();
        /*

         */
    fixFix.SetPassword("ff58");
    fixFix.SelectDay();
    fixFix.SelectMonth();
    fixFix.SelectYear();
    fixFix.FillFirstName("ff");
    fixFix.LastFirstName("fff");
    fixFix.SetAddress("nasr city");
    fixFix.SelectCountry();
    fixFix.SetState("cairo");
    fixFix.SetCity("fff");
    fixFix.SetZIPcode("588");
    fixFix.SetmobileNumber("02222");
    fixFix.ClickCreateButton();










}
}
