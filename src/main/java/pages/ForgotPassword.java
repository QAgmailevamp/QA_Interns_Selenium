package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By mail = By.id("email");
    private By resetButton = By.cssSelector("#forgot_password button");
    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }
    public void enterEmail(){
        driver.findElement(mail).sendKeys("TAU@example.com");
    }
    public emailPage clickButton(){
        driver.findElement(resetButton);
        return new emailPage(driver);
    }
}
