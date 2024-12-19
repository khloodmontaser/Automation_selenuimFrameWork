package PageObjects.HomePage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class HomePageActions extends HomePageElements {
    Assertion assertion;
    BrowserActions browserActions;
    public HomePageActions(WebDriver driver){
        assertion = new Assertion(driver);
        browserActions = new BrowserActions(driver);
    }
    public void navigateToHomePage(String url){
        browserActions.navigateToURl(url);
    }
    public void validateHomePageTitleIsDisplayed(){
        assertion.assertElementIsDisplayed(Title);
    }
    public void clickCartButton() {
        browserActions.click(cartButton);

    }
}