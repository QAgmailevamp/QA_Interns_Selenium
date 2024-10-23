package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    private WebDriver driver;
    private By slider = By.xpath("//*[@id=\"content\"]/div/div/input");
    private By result = By.id("range");
    public  SliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickSlider(){
        for (int i = 0; i < 8; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        };
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
