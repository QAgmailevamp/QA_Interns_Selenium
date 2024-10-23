package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage
{
    private WebDriver driver;
    private By box = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void rightClick()
    {
        WebElement cbox = driver.findElement(box);
        Actions actions = new Actions(driver);
        actions.contextClick(cbox).perform();
    }

    public String msgAlert()
    {
        return driver.switchTo().alert().getText();
    }

    public void clickOk()
    {
         driver.switchTo().alert().accept();
    }
}
