package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Hover2Page {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption= By.className("figcaption");
    public Hover2Page(WebDriver driver){
        this.driver = driver;
    }
    public figureCaption hoverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index - 1);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new figureCaption(figure.findElement(boxCaption));
    }
    public class figureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public figureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionShown(){
            return caption.isDisplayed();
        }
        public String linkText(){
            return caption.findElement(header).getText();
        }
        public String linkRef(){
            return caption.findElement(link).getAttribute("href");
        }
    }
}
