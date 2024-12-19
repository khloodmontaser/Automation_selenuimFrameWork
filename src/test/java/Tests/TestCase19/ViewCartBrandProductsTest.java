package Tests.TestCase19;

import Config.Config;

import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ViewCartBrandProductsTest extends TestBase {

    HomePageActions homePageActions;
    NavBarActions navBarActions;
    ProductsPageActions productsPageActions;
    String url = Config.getProperty("URL");


    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        productsPageActions = new ProductsPageActions(driver);
    }


    // Navigate to the application URL
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }

    @Test
    public void ViewCartBrandProducts() {
        // Step 1 & 2: Launch browser and navigate to the URL
        navigateToUrl();

        // Step 3:  Click on 'Products' button and verify products are displayed
        navBarActions.clickProductButton();
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.validateItemsIsDisplayed();

        // Step 4:  Verify that Brands are visible on left side bar
        productsPageActions.validateBrandsIsDisplayed();



        // Step 5: Click on any brand name ex: polo
        //productsPageActions.clickBrandsPoloButton();  //static
        productsPageActions.clickBrand("Polo");

        // Step 6: Verify that user is navigated to brand page and brand products are displayed
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.validateItemsIsDisplayed();


        // Step 7: On left side bar, click on any other brand link ex:biba
        //productsPageActions.clickBrandsBibaButton();
        productsPageActions.clickBrand("Biba");

        // Step 8: Verify that user is navigated to that brand page and can see products
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.validateItemsIsDisplayed();

    }














}
