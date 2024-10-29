package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));
    public DynamicLoadPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadExample1Page(driver);
    }
    public DynamicLoadExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadExample2Page(driver);
    }
    public DynamicLoadExample2Page rightClickOnExample2Link(){
        driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadExample2Page(driver);
    }



}
