package PageObjects.HomePage;

import org.openqa.selenium.By;

public class HomePageElements {
    By Title =By.xpath("//div[@id='slider-carousel']//div[@class='carousel-inner']");
    By cartButton = By.xpath("//a[contains(text(),'Cart')]");
}