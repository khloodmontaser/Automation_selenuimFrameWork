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
}
