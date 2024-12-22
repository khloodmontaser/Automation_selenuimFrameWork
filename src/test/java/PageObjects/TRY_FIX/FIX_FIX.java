package PageObjects.TRY_FIX;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class FIX_FIX extends FIX_Elements{

    BrowserActions browserActions;
    Assertion assertion;

    public FIX_FIX(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }
    public void SetPassword(String pass){
        browserActions.type(Password ,  pass);
    }

    public void SelectDay(){
        browserActions.click(DAY);
    }
    public void SelectMonth(){
        browserActions.click(MONTH);
    }
    public void SelectYear(){
        browserActions.click(YEAR);
    }
    public void FillFirstName (String F_name){
        browserActions.type(FirstName, F_name);
    }
    public void LastFirstName (String L_name){
        browserActions.type(LastName, L_name);
    }
    public void SetAddress (String ADD){
        browserActions.type(ADDRESS, ADD);
    }
    public void SelectCountry(){
        browserActions.click(Country);
    }

    public void SetState (String ST){
        browserActions.type(state, ST);
    }

    public void SetCity (String cty){
        browserActions.type(city, cty);
    }

    public void SetZIPcode (String zip){
        browserActions.type(zipcode, zip);
    }

    public void SetmobileNumber (String Mob){
        browserActions.type(mobile, Mob);
    }
    public void ClickCreateButton(){
        browserActions.click(create_button);
    }




}
