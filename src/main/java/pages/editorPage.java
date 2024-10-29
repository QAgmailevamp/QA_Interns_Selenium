package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class editorPage {
    private WebDriver driver;
    private By button = By.cssSelector("button.tox-notification__dismiss");
    private By editorBody = By.id("tinymce");

    public editorPage(WebDriver driver){
        this.driver = driver;
    }
    public void closeButton() {
        // Wait for the close button to be visible before clicking
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(button));
        closeButton.click();
    }
    public String getText(){
        driver.switchTo().frame("mce_0_ifr");
        return driver.findElement(editorBody).getText();
    }
}
