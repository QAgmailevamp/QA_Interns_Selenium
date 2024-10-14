package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MenuElement
{
    private WebDriver driver;

    public void find()
    {
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement scLink = driver.findElement(By.linkText("Shifting Content"));
        scLink.click();

        WebElement menuLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuLink.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println("Number of items that appear : " + links.size());


        System.out.println(driver.getTitle());

        driver.quit();
    }

    public static void main(String[] args)
    {
        MenuElement test2 = new base.MenuElement();
        test2.find();
    }


}
