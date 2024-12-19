package PageObjects.CartPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

//import java.util.ArrayList;
//import java.util.List;


public class CartPageActions extends CartPageElements{


    Assertion assertion;
    BrowserActions browserActions;
    public CartPageActions(WebDriver driver){
        assertion = new Assertion(driver);
        browserActions = new BrowserActions(driver);
    }
    //add to cart from add to cart test case



    //validate cart page is displayed

    public void validateCarPageIsDisplayed() {
        assertion.assertElementIsDisplayed(CART_INFO);
    }

    //validate removing a product
    public void clickRemoveButton() {
        browserActions.click(REMOVE_BUTTON);
    }

    public void validateDeletionMessageIsDisplayed() {
        assertion.assertElementIsDisplayed(MESSAGE_OF_EMPTY_CART);
    }








        // Remove a product based on product ID law  h3ml dynamic
    /*
        public void removeProductFromCart(String productId) {
            WebElement removeButton = driver.findElement(cartPageElements.getRemoveButton(productId));
            removeButton.click();
        }



    // Get all product IDs currently in the cart
        public List<String> getAllProductIds() {
            List<String> productIds = new ArrayList<>();

            // Locate all product rows in the cart
            List<WebElement> productRows = driver.findElements(By.xpath("//tr[contains(@id, 'product-')]"));

            // Extract the product ID from each row's ID attribute (e.g., "product-1")
            for (WebElement row : productRows) {
                String idAttribute = row.getAttribute("id"); // Example: "product-1"
                if (idAttribute != null && idAttribute.startsWith("product-")) {
                    String productId = idAttribute.replace("product-", ""); // Extract "1" from "product-1"
                    productIds.add(productId);
                }
            }

            return productIds;
        }

        // Verify if a specific product row is present
        public boolean isProductInCart(String productId) {
            List<WebElement> productRows = driver.findElements(cartPageElements.getProductRow(productId));
            return !productRows.isEmpty(); // If found, it returns true
        }*/


}
