package PageObjects.SignUpLogin;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class SingUPLoginActions extends SingUPLoginElements {
    BrowserActions browserActions;
    Assertion assertion;

    public SingUPLoginActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    public void enterSignUPNameInput(String input) {
        browserActions.type(SignUPUserNameInput, input);
    }

    public void enterSignUPEmailInput(String input) {
        browserActions.type(SignUPEmailInput, input);
    }

    public void clickSignUpButton() {
        browserActions.click(SignUpButton);
    }

    public void validateNewUserSignUpTitleIsDisplayed() {
        assertion.assertElementIsDisplayed(NewUserSignUpTitle);
    }

    public void chooseGenderMr() {browserActions.click(ChooseGenderMr);}
    //   public void enterUserNewName(String input) {browserActions.type(UserNewName, input);}
    //  public void enterUserNewEmail(String input) {browserActions.type(UserNewEmail, input);}
    public void enterUserNewPassword(String input) {
        browserActions.type(UserNewPassword, input);
    }

    public void selectDay() {
        browserActions.click(SelectDay);
    }


    public void selectMonth (){
        browserActions.click(SelectMonth);

    }
    public void selectYear (){browserActions.click(SelectYear);}
    public void fillFirstNamefield(String input) {
        browserActions.type(FillFirstName, input);
    }
    public void fillLastNamefield(String input) {
        browserActions.type(FillLastName, input);
    }
    public void fillCompanyfield(String input) {
        browserActions.type(FillCompany, input);
    }
    public void fillAddressfield(String input) {
        browserActions.type(FillAddress, input);
    }
    public void selctCountry() {browserActions.click(SelectCountry);}

    public void fillStatefield(String input) {
        browserActions.type(FillState, input);
    }
    public void fillCityfield(String input) {
        browserActions.type(FillCity, input);
    }
    public void fillZipCodefield(String input) {
        browserActions.type(FillZipCode, input);
    }
    public void fillMobilePhonefield(String input) {
        browserActions.type(FillMobilePhone,input);
    }
    public void clickCreateAccountButton() {browserActions.click(ClickCreateAccountButton);}

    public void checkaccountcreatedIsDisplayed(){assertion.assertElementIsDisplayed(Checkaccountcreated);}
    public void checkcontinuebutton (){browserActions.click(Checkcontinuebutton);}
    public void checkuserloginIsDisplayed(){assertion.assertElementIsDisplayed(Checkuserlogin);}




}