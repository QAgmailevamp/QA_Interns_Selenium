package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

//    public LoginPage clickFormAuthentication()
//    {
//        clickLink("Form Authentication");
//        return new LoginPage(driver);
//    }

//    public DropdownPage clickDropDown()
//    {
//        clickLink("Dropdown");
//        return new DropdownPage(driver);
//    }

//    public FPPage clickFP()
//    {
//        clickLink("Forgot Password");
//        return new FPPage(driver);
//    }

//    public HoversPage clickHovers()
//    {
//        clickLink("Hovers");
//        return new HoversPage(driver);
//    }

//    public KeyPressesPage clickKeyPresses()
//    {
//        clickLink("Key Presses");
//        return new KeyPressesPage(driver);
//    }

    public HSliderPage clickHSlider()
    {
        clickLink("Horizontal Slider");
        return new HSliderPage(driver);
    }


    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }





}
