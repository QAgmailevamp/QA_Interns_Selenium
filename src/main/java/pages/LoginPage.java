package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void userName(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void Password(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public secureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new secureAreaPage(driver);
    }
}
