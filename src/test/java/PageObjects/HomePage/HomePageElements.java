package PageObjects.HomePage;

import org.openqa.selenium.By;

public class HomePageElements {
    By Title =By.xpath("//div[@id='slider-carousel']//div[@class='carousel-inner']");
    By cartButton = By.xpath("//a[contains(text(),'Cart')]");
    By footer = By.xpath("//footer[@id = 'footer']");
    By subscribtion = By.xpath("//h2[text()='Subscription']");
    By ArrowUpward = By.xpath("//i[@class='fa fa-angle-up']");
    By FullfledgedText = By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']");
}