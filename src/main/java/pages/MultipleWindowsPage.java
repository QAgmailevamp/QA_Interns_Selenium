package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    private By clickHereLink = By.linkText("Click Here");
    public  MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }
}
