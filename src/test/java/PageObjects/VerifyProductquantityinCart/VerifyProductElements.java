package PageObjects.VerifyProductquantityinCart;

import org.openqa.selenium.By;

public class VerifyProductElements {
    // Locators for home page
    By homePageVisibleElement =By.xpath("//div[@id='slider-carousel']//div[@class='carousel-inner']");

    // Locators for viewing product
    By viewProductButton = By.xpath("//a[contains(text(),'View Product')]");
    By productDetailPage = By.xpath("//div[@class='product-information']");

    // Locators for product actions
    By quantityInput = By.xpath("//input[@id='quantity']");
    By addToCartButton = By.xpath("//button[@class='btn btn-default cart']");
    By viewCartButton = By.xpath("//p[@class='text-center']//a[@href='/view_cart']\n");

    // Locators for cart verification
    By cartProductQuantity = By.xpath("//td[@class='cart_quantity']//button");
}

