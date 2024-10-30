package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTest
{
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());


//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        goHome();
        setCookie();


    }

    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void teardown()
//    {
//        driver.quit();
//    }

    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        if (ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshot/test.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
        }
    }

    public WindowManager getWindowManager()
    {
        return new WindowManager(driver);
    }


    private ChromeOptions getChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--headless");
        return options;
    }

    private void setCookie()
    {
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }



}



//List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        System.out.println("yahan tk ho gya");
//
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();
//
//        System.out.println(driver.getTitle());
//        System.out.println("");