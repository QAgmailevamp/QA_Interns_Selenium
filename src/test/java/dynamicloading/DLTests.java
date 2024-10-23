package dynamicloading;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DLE1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class DLTests extends BaseTest
{
    @Test
    public void start()
    {
        var s = homePage.clickDynamicLoading().clickExample1();
        s.clickStart();
        assertEquals(s.getLoadedText(), "Hello World!", "error");

        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
