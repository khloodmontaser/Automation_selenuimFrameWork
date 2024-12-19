package PageObjects.ProductsPage;

import org.openqa.selenium.By;


public class ProductsPageElements {

    // Title of products page
    By TITLE_TYPE_PRODUCT = By.xpath("//h2[@class='title text-center']");

    //ITEMS on products
    By ITEM_PRODUCT = By.xpath("//div[@class='features_items']");

    //brands in left sidebar
    By BRANDS_PRODUCT = By.xpath("//div[@class='brands_products']");

    //xpathes of the brands
   /* By BRANDS_POLO = By.xpath("//a[@href='/brand_products/Polo']");
    By BRAND_HandM= By.xpath("//a[@href='/brand_products/H&M']");
    By BRAND_MADAME = By.xpath("//a[@href='/brand_products/Madame']");
    By BRAND_Mast_and_Harbour = By.xpath("//a[@href='/brand_products/Mast & Harbour']");
    By BRAND_Babyhug = By.xpath("//a[@href='/brand_products/Babyhug']");
    By BRAND_Allen_Solly_Junior = By.xpath("//a[@href='/brand_products/Allen Solly Junior']");
    By BRAND_Kookie_Kids= By.xpath("//a[@href='/brand_products/Kookie Kids']");
    By BRAND_Biba = By.xpath("//a[@href='/brand_products/Biba']");
    */


    public By getBrandLocator(String brandName) {
        return By.xpath("//a[@href='/brand_products/" + brandName + "']");
    }









}
