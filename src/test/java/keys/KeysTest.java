package keys;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class KeysTest extends BaseTest {
    @Test
    public void testBackspace(){

        var keysPage =homepage.clickKeyPresses();
        keysPage.enterText("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(keysPage.getResult(),"You entered: BACK_SPACE", "Key not working");
    }
}
