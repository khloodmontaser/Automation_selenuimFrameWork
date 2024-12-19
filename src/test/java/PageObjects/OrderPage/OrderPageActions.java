package PageObjects.OrderPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class OrderPageActions extends OrderPageElements{
    WebDriver driver;
    BrowserActions browserActions;
    Assertion assertion;
    public OrderPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public void enterOrderComment(String comment) {
        browserActions.type(commentTextArea,comment);

    }

    public void clickPlaceOrder() {
        browserActions.click(placeOrderButton);

    }

    public void clickDownloadInvoice() {
        browserActions.click(downloadInvoiceButton);

    }
}