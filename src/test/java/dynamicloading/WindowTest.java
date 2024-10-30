package dynamicloading;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowTest extends BaseTest
{

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToTab("New Window");
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }

}
