package PageObjects.SignUpLogin;

import org.openqa.selenium.By;

public class SingUPLoginElements {
    By NewUserSignUpTitle=By.xpath("//div[@class='signup-form']/h2");
    By SignUPUserNameInput=By.xpath("//input[@data-qa='signup-name']");
    By SignUPEmailInput=By.xpath("//input[@data-qa='signup-email']");
    By SignUpButton=By.xpath("//button[@data-qa='signup-button']");
}
