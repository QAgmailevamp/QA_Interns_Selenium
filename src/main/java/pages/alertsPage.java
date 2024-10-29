package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertsPage {
    private WebDriver driver;
    private By alertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By confirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By promptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By result = By.id("result");
    public alertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(alertButton).click();
    }
    public void triggerconfirm(){
        driver.findElement(confirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(promptButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public void enterPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }
    public String getText(){
        return driver.findElement(result).getText();
    }
    public String getconfirmText(){
        return driver.switchTo().alert().getText();
    }
    public String getResult(){
        return  driver.findElement(result).getText();
    }
}
