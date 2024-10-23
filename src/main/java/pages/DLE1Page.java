package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DLE1Page
{
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By text = By.id("finish");

    public DLE1Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickStart()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        wait.until(ExpectedConditions.elementToBeClickable(startButton));
        driver.findElement(startButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(loading));
    }

    public String getLoadedText()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        return driver.findElement(text).getText();
    }
}
