package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FPPage
{
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retButton = By.id("form_submit");

    public FPPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public AlertPage clickRetButton()
    {
        driver.findElement(retButton).click();
        return new AlertPage(driver);
    }


}
