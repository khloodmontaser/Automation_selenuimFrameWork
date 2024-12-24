package PageObjects.ProductsPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class ProductsPageActions extends ProductsPageElements {

    Assertion assertion;
    BrowserActions browserActions;

    public ProductsPageActions(WebDriver driver) {
        assertion = new Assertion(driver);
        browserActions = new BrowserActions(driver);
    }

    public void validateProductTitleIsDisplayed() {
        assertion.assertElementIsDisplayed(TITLE_TYPE_PRODUCT);
    }

    public void validateItemsIsDisplayed() {
        assertion.assertElementIsDisplayed(ITEM_PRODUCT);
    }

    public void validateBrandsIsDisplayed() {
        assertion.assertElementIsDisplayed(BRANDS_TITLE);
    }


    /*public void clickBrandsPoloButton() {
        browserActions.click(BRANDS_POLO);
    }

    public void clickBrandsBibaButton() {
        browserActions.click(BRAND_Biba);
    }*/

    // dynamic for brands

    public void clickBrand(String brandName) {
        browserActions.scrollTillElement(BRANDS_PRODUCT);
        browserActions.click(getBrandLocator(brandName));
    }
}
