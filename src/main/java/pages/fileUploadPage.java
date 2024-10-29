package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private  By uploadedFiles = By.id("uploaded-files");

    public fileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void Upload(){
        driver.findElement(uploadButton).click();
    }
    public void chooseFile(String path){
        driver.findElement(inputField).sendKeys(path);
        Upload();
    }
    public String getResult(){
        return driver.findElement(uploadedFiles).getText();
    }

}
