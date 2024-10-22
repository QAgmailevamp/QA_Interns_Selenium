package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");
//    private By logout = By.linkText("Logout");
    public secureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAlert(){
        return driver.findElement(statusAlert).getText();
    }
}
