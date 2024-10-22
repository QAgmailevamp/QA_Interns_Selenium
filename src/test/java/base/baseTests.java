package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class baseTests {
    private WebDriver driver;
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().setSize(new Dimension(375,812));
        System.out.println(driver.getTitle());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        WebElement inputLinks = driver.findElement(By.linkText("Inputs"));
        inputLinks.click();

    }

    public static void main(String[] args) {
        baseTests test = new baseTests();
        test.setUp();
    }
}
