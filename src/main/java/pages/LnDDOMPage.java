package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LnDDOMPage
{
    private WebDriver driver;
    private By table = By.id("large-table");

    public LnDDOMPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void scrollToTable()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tableElement = wait.until(ExpectedConditions.visibilityOfElementLocated(table));

        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script, tableElement);
    }
}
