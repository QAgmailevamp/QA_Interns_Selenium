package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTest
{
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver();

        goHome();

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

    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
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
