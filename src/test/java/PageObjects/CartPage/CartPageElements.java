package PageObjects.CartPage;

import org.openqa.selenium.By;


public class CartPageElements {
    // static locator

    //By PRODUCT_ROW=By.xpath("//tr[@id='product-1']");
    By REMOVE_BUTTON=By.xpath("//a [@data-product-id='1']");
    By MESSAGE_OF_EMPTY_CART=By.xpath("//span[@id='empty_cart']");
    By CART_INFO=By.xpath("//div[@id='cart_info']");
    By placeOrderButton = By.xpath("//a[contains(text(), 'Place Order')]");
    By proceedToCheckoutButton = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");


    By commentTextArea = By.name("message");

    // Payment Details
    By nameOnCardField = By.name("name_on_card");
    By cardNumberField = By.name("card_number");
    By cvcField = By.name("cvc");
    By expirationMonthField = By.name("expiry_month");
    By expirationYearField = By.name("expiry_year");

    By payAndConfirmButton = By.id("submit");

    // Success Message
    By successMessage = By.xpath("//p[contains(text(), 'Your order has been placed successfully!')]");
    By downloadInvoiceButton = By.xpath("//a[contains(text(), 'Download Invoice')]");
    By continueButton = By.xpath("//a[contains(text(), 'Continue')]");
    By deleteAccountButton = By.xpath("//a[contains(text(), 'Delete Account')]");

    // Success Message
    By accountDeletedMessage = By.xpath("//h2[contains(text(), 'ACCOUNT DELETED!')]");

}