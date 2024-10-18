package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MsgPage
{
    private WebDriver driver;
    private By msg = By.id("flash");

    public MsgPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public String getMsgText()
    {
        return driver.findElement(msg).getText();
    }
}
