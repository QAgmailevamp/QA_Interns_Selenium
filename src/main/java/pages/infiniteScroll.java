package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class infiniteScroll {
    private WebDriver driver;
    private By textblock = By.className("jscroll-added");
    public infiniteScroll(WebDriver driver){
        this.driver = driver;
    }
    public  void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while(getNumberofParas() < index){
            jsExecutor.executeScript(script);
        }
    }
    private int getNumberofParas(){
        return driver.findElements(textblock).size();
    }
}
