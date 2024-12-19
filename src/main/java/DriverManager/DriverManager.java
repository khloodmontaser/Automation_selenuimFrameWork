package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    WebDriver driver;
    public void initDriver(String browserName){
        if(browserName == null || browserName.isEmpty()){
            browserName = "chrome";
        }
        switch (browserName){
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
        }
    }
    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
    public WebDriver getDriver(){
        return driver;
    }
}
