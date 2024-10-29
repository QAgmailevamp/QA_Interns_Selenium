package navigation;

import base.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.testng.annotations.Test;
import utils.WindowManager;

import java.util.Base64;

import static org.testng.AssertJUnit.assertTrue;

public class NavigationTests extends BaseTest {
    @Test
    public void testNavigator(){
        homepage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().Referesh();
        getWindowManager().goTo("https://google.com");
    }
    @Test
    public void testMultipleWindows(){
        homepage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTabs("New Window");
    }

    @Test
    public void testExample2Window(){
        var buttonPage = homepage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        Assert.isTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
