package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class waitTest extends BaseTest {
    @Test
    public void testWait(){
//        var example1page = homepage.clickDynamicLoading().clickExample1();
//        example1page.clickStart();
//        example1page.getLoadedText();
        var loadingPage = homepage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
