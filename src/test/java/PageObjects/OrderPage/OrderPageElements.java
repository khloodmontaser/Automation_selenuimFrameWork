package PageObjects.OrderPage;

import org.openqa.selenium.By;

public class OrderPageElements {
    By commentTextArea = By.xpath("//textarea[@name='message']");
    By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");
    By downloadInvoiceButton = By.xpath("//a[contains(text(),'Download Invoice')]");
}