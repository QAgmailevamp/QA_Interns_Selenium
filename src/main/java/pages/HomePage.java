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
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
