package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage
{
    private WebDriver driver;
    private By msg = By.id("flash");

    public AlertPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public String getAlertText()
    {
        return driver.findElement(msg).getText();
    }
}
