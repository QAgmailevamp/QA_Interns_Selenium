package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFromAuth(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public ForgotPassword clickForgotPasswordPage(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    public HoverPage clickHoverPage(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }
    public SliderPage clickSliderPage(){
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public alertsPage clickAlertsPage(){
        clickLink("JavaScript Alerts");
        return new alertsPage(driver);
    }
    public fileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new fileUploadPage(driver);
    }
    public contextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new contextMenuPage(driver);
    }
    public editorPage clickEditorPage(){
        clickLink("WYSIWYG Editor");
        return new editorPage(driver);
    }
    public DynamicLoadPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadPage(driver);
    }
    public DomPage clickLargeDeepDom(){
        clickLink("Large & Deep DOM");
        return new DomPage(driver);
    }
    public infiniteScroll clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new infiniteScroll(driver);
    }
    public jsDropDown clickJsDropDownPage(){
        clickLink("Dropdown");
        return new jsDropDown(driver);
    }
    public MultipleWindowsPage clickMultipleWindowsPage(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
