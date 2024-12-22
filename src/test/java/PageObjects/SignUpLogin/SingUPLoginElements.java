package PageObjects.SignUpLogin;

import org.openqa.selenium.By;

public class SingUPLoginElements {

    // Signup Form Locators
    By NewUserSignUpTitle = By.xpath("//div[@class='signup-form']/h2");
    By SignUPUserNameInput = By.xpath("//input[@data-qa='signup-name']");
    By SignUPEmailInput = By.xpath("//input[@data-qa='signup-email']");
    By SignUpButton = By.xpath("//button[@data-qa='signup-button']");

    // Personal Details
    By ChooseGenderMr = By.xpath("//input[@id='id_gender1']");
    By UserNewPassword = By.xpath("//input[@data-qa='password']");
    By SelectDay = By.xpath("//select[@data-qa='days']/option[text()='3']");
    By SelectMonth = By.xpath("//select[@id='months']/option[text()='March']");
    By SelectYear = By.xpath("//select[@id='years']/option[text()='2003']");

    // Address Information
    By FillFirstName = By.xpath("//input[@data-qa=\"first_name\"");


    By FillLastName = By.xpath("//*[@id='last_name']");
    By FillCompany = By.xpath("//*[@id=\"company\"]");
    By FillAddress = By.xpath("//*[@id=\"address1\"]");
    By SelectCountry = By.xpath("//select[@id='country']/option[text()='Canada']");


    By FillState = By.xpath("//*[@data-qa=\"state\"]");
    By FillCity = By.xpath("//*[@name='city']");
    By FillZipCode = By.xpath("//*[@id=\"zipcode\"]");
    By FillMobilePhone = By.xpath("//*[@id=\"mobile_number\"]");

    // Account Creation
    By ClickCreateAccountButton = By.xpath("//button[@data-qa='create-account']");
    By Checkaccountcreated = By.xpath("//h2[@class='title text-center']/b");
    By Checkcontinuebutton = By.xpath("//a[@data-qa='continue-button']");
    By Checkuserlogin = By.xpath("//i[@class='fa fa-user']");

    // Utility Method for Dynamic Dropdown Selection
    public By selectDropdownOption(String dropdownId, String optionText) {
        return By.xpath("//select[@id='" + dropdownId + "']/option[text()='" + optionText + "']");
    }
}
