package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        homepage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
