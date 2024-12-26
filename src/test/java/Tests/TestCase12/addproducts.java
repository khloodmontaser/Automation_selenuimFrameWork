package Tests.TestCase12;

import Config.Config;
import PageObjects.AddProductsinCart.AddProductActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addproducts extends TestBase {
    String url = Config.getProperty("URL");
    AddProductActions  addProductActions;
    HomePageActions homePageActions;
    NavBarActions navBarActions;



    @BeforeMethod
    public void setupTest() {
        addProductActions = new AddProductActions(driver);
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);



    }
    @Test
    public void addProductsToCartAndVerify() {
        addProductActions.navigateToUrl(url);

        // Step 2: Verify that home page is visible
        homePageActions.validateHomePageTitleIsDisplayed();
        // Step 3: Click 'Products' button
        navBarActions.clickProductButton();

        // Step 4: Hover over first product and click 'Add to cart'
        addProductActions.AddFirstProductToCart();


        // Step 5: Click 'Continue Shopping'
        addProductActions.clickContinueShopping();


        // Step 6: Hover over second product and click 'Add to cart'
        addProductActions.addSecondProductToCart();
        // Step 7: Click 'View Cart' button
        addProductActions.clickViewCartButton();


        // Step 8: Verify both products are added to Cart
        Assert.assertTrue(addProductActions.areBothProductsAdded(), "Products are not added to cart!");
        // Step 9: Verify their prices, quantity, and total price
        String firstProductPrice = addProductActions.getProductPrice(addProductActions.firstProductPrice);
        String firstProductQuantity = addProductActions.getProductQuantity(addProductActions.firstProductQuantity);
        String firstProductTotal = addProductActions.getProductTotal(addProductActions.firstProductTotal);
        String secondProductPrice = addProductActions.getProductPrice(addProductActions.secondProductPrice);
        String secondProductQuantity = addProductActions.getProductQuantity(addProductActions.secondProductQuantity);
        String secondProductTotal = addProductActions.getProductTotal(addProductActions.secondProductTotal);
        // Verify first product details
        Assert.assertEquals(firstProductPrice, "Rs. 500", "First product price is incorrect!");
        Assert.assertEquals(firstProductQuantity, "1", "First product quantity is incorrect!");
        Assert.assertEquals(firstProductTotal, "Rs. 500", "First product total is incorrect!");

        // Verify second product details
        Assert.assertEquals(secondProductPrice, "Rs. 400", "Second product price is incorrect!");
        Assert.assertEquals(secondProductQuantity, "1", "Second product quantity is incorrect!");
        Assert.assertEquals(secondProductTotal, "Rs. 400", "Second product total is incorrect!");
    }
}