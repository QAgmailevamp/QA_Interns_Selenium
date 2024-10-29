package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class contextMenuPage {
    private WebDriver driver;
    private By container = By.id("hot-spot");

    public  contextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnContainer(){
        Actions action = new Actions(driver);
        WebElement Box = driver.findElement(container);
        action.contextClick(Box).perform();
    }
    public String gettAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

}
