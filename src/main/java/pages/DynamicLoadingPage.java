package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage
{
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));


    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public DLE1Page clickExample1()
    {
        driver.findElement(link_Example1).click();
        return new DLE1Page(driver);
    }

    public DLE2Page clickExample2()
    {
        driver.findElement(link_Example2).click();
        return new DLE2Page(driver);
    }

    public DLE2Page rightClickOnExample2Link(){
        driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DLE2Page(driver);
    }
}
