package PageObjects.CartPage;

import org.openqa.selenium.By;


public class CartPageElements {
    // static locator

    //By PRODUCT_ROW=By.xpath("//tr[@id='product-1']");
    By REMOVE_BUTTON=By.xpath("//a [@data-product-id='1']");
    By MESSAGE_OF_EMPTY_CART=By.xpath("//span[@id='empty_cart']");
    By CART_INFO=By.xpath("//div[@id='cart_info']");




    /*
    //dynamic locator law kont h add aktar mn element bs mafesh message when remove element mn kza haga


        // Dynamic locator for a specific product row in the cart
        public By getProductRow(String productId) {
            return By.xpath("//tr[@id='product-" + productId + "']");
        }

        // Dynamic locator for the remove button based on product ID
        public By getRemoveButton(String productId) {
            return By.xpath("//a[@data-product-id='" + productId + "']");
        }*/


}
