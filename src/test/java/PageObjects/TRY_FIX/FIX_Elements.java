package PageObjects.TRY_FIX;

import org.openqa.selenium.By;

public class FIX_Elements {

    By Password = By.xpath("//input[@id='password']");

    By DAY = By.xpath("//SELECT[@id='days'/option[text()='25']");
    By MONTH = By.xpath("//SELECT[@id='months'/option[text()='March']");
    By YEAR = By.xpath("//SELECT[@id='years'/option[text()='2002']");

    By FirstName = By.xpath("//input[@id='first_name']");
    By LastName = By.xpath("//input[@id='last_name']");

    By ADDRESS = By.xpath("//input[@id='address1']");
    By Country = By.xpath("//select[@id='country']/option[text()='Canada']");

    By state = By.xpath("//input[@id='state']");
    By city = By.xpath("//input[@id='city']");

    By zipcode = By.xpath("//input[@id='zipcode']");
    By mobile = By.xpath("//input[@id='mobile_number']");

    By create_button = By.xpath("//button[text()='Create Account']");




}
