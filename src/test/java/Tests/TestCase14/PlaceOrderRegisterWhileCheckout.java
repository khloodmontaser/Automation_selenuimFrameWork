package Tests.TestCase14;
import Tests.TestBase;
import Config.Config;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.CartPage.CartPageActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.PaymentPage.PaymentPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderRegisterWhileCheckout extends TestBase
{
    HomePageActions homePageActions;
    NavBarActions navBarActions;
    CartPageActions cartPageActions;
    VerifyProductActions verifyProductActions;
    DeleteAccountActions deleteAccountActions;
    PaymentPageActions paymentPageActions;
    SingUPLoginActions signUpLoginActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        cartPageActions = new CartPageActions(driver);
        verifyProductActions = new VerifyProductActions(driver);
        deleteAccountActions = new DeleteAccountActions(driver);
        paymentPageActions = new PaymentPageActions(driver);
        signUpLoginActions = new SingUPLoginActions(driver);

    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }


    @Test
    public void PlaceOrderRegisterWhileCheckoutTest(){
        navigateToUrl();

        String userName = Utilities.generateRandomString(7);
        String comment = Utilities.generateRandomString(15);
        String email = Utilities.generateRandomString(7) + "@gmail.com";
        String newuserpassword = Utilities.generateRandomString(30);
        String firstname = Utilities.generateRandomString(7);
        String lastname = Utilities.generateRandomString(7);
        String company = Utilities.generateRandomString(7);
        String address = Utilities.generateRandomString(7);
        String state = Utilities.generateRandomString(7);
        String city = Utilities.generateRandomString(7);
        String zip = Utilities.generateRandomString(4);
        String number = Utilities.generateRandomString(9);


        // for payment info
        String cardName = Utilities.generateRandomString(20);
        //String cardNumber = Utilities.generateRandomString(15);
        String cardNumber = String.valueOf(Utilities.generateRandomNumber(13, 16));


        homePageActions.validateHomePageTitleIsDisplayed();
        //ADD PRODUCT
       // driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
        verifyProductActions.clickViewProduct();
        verifyProductActions.clickAddToCart();
        verifyProductActions.clickContinueShoppingButton();

        navBarActions.clickCartButton();

        cartPageActions.validateCarPageIsDisplayed();
        cartPageActions.clickProceedToCheckoutButton();
        cartPageActions.clickRegisterLoginButton();

        //9. Fill all details in Signup and create account

        signUpLoginActions.enterSignUPNameInput(userName);
        signUpLoginActions.enterSignUPEmailInput(email);
        signUpLoginActions.clickSignUpButton();

        signUpLoginActions.enterUserNewPassword(newuserpassword);
        signUpLoginActions.selectDay();
        signUpLoginActions.selectMonth();
        signUpLoginActions.selectYear();

        signUpLoginActions.enterUserNewPassword(newuserpassword);
        signUpLoginActions.selectDay();
        signUpLoginActions.selectMonth();
        signUpLoginActions.selectYear();

       // driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript(("document.querySelector('#first_name').value = arguments[0];"), firstname);
//        ((JavascriptExecutor) driver).executeScript(("document.querySelector('##last_name').value = arguments[0];",lastname );


        signUpLoginActions.fillFirstNamefield(firstname);
        signUpLoginActions.fillLastNamefield(lastname);
        signUpLoginActions.fillCompanyfield(company);
        signUpLoginActions.fillAddressfield(address);


        signUpLoginActions.selctCountry();
        signUpLoginActions.fillStatefield(state);
        signUpLoginActions.fillCityfield(city);
        signUpLoginActions.fillZipCodefield(zip);
        signUpLoginActions.fillMobilePhonefield(number);
        signUpLoginActions.clickCreateAccountButton();

        signUpLoginActions.checkaccountcreatedIsDisplayed();
        signUpLoginActions.checkcontinuebutton();

        signUpLoginActions.checkuserloginIsDisplayed();
        navBarActions.clickCartButton();

        cartPageActions.clickProceedToCheckoutButton();

        //14. Verify Address Details and Review Your Order
        cartPageActions.validateAddressTitleIsDisplayed();
        cartPageActions.validateAddressDetailsIsDisplayed();
        cartPageActions.validateOrderIsDisplayed();


        cartPageActions.enterComment(comment);
        cartPageActions.clickPlaceOrderButton();
        paymentPageActions.enterCardName(cardName);
        paymentPageActions.enterCardNumber(cardNumber);
        paymentPageActions.enterCVC("123");
        paymentPageActions.enterMonth("10");
        paymentPageActions.enterYear("2026");

        paymentPageActions.clickPayAndConfirmButton();
        paymentPageActions.validateSuccessMessageIsDisplayed();


        navBarActions.clickDeleteAccountButton();

        deleteAccountActions.validateAccountDeletedMessageIsDisplayed();
        deleteAccountActions.clickContinueButton();





    }






}
