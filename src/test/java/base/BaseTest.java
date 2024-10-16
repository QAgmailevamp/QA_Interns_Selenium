package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.time.Duration;
import java.util.List;

public class BaseTest
{
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        System.out.println("yahan tk ho gya");
//
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();
//
//        System.out.println(driver.getTitle());
        System.out.println("");



    }

//    @AfterClass
//    public void teardown()
//    {
//        driver.quit();
//    }


//    public static void main(String[] args)
//    {
//        BaseTest test = new BaseTest();
//        test.setUp();
//    }
}
