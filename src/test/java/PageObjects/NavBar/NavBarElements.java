package PageObjects.NavBar;

import org.openqa.selenium.By;

public class NavBarElements {
    By SignUpLoginButton = By.xpath("//a[@href='/login']");
    By ContactUsButton = By.xpath("//a[@href='/contact_us']");
    By HomeButton = By.xpath("//a[@href='/']");


    // Locator for the Add to Cart button in the navbar
    By CART_BUTTON = By.xpath("//a[@href='/view_cart']");
    By PRODUCTS_BUTTON = By.xpath("//a[@href='/products']");


}
