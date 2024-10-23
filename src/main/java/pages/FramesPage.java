package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FramesPage
{
    private WebDriver driver;
    private WebDriverWait wait;

    private By cross = By.xpath("//div[contains(@aria-label, 'Close') and contains(@class, 'tox-icon')]");
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    public FramesPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void crossPopup()
    {
        try
        {
            WebElement closeButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(cross));

            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(closeButton));

            closeButton.click();
            System.out.println("Popup closed successfully.");
        }
        catch (Exception exception)
        {
            System.out.println("Popup not found or already dismissed.");
            exception.printStackTrace();
        }
    }


    public void switchToEditArea()
    {
        driver.switchTo().frame(editorIframeId);
    }


    public String getText()
    {
       return driver.findElement(textArea).getText();

    }

}
