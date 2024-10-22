package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise1 {
    private WebDriver driver;
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().setSize(new Dimension(375,812));
        WebElement inputLinks = driver.findElement(By.linkText("Shifting Content"));
        inputLinks.click();
        WebElement menuLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuLink.click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());


    }

    public static void main(String[] args) {
        Exercise1 exercise = new Exercise1();
        exercise.setUp();
    }
}

