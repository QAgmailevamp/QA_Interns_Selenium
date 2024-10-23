package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hover2Page;

public class HoverTests extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoversPage = homepage.clickHoverPage();
        var caption = hoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        Assert.assertEquals(caption.getTitle(),"name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(),"View profile", "Caption link text is incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
//    @Test
//    public void testHoverUser2(){
//        var hoverspage = homepage.clickHoverPage();
//        var caption = hoverspage.hoverFigure(3);
//         caption.isCaptionShown();
//         Assert.assertTrue(caption.linkRef().contains("users/3"),"Incorrect Link");
//        Assert.assertEquals(caption.linkText(),"name: user3", "Caption title incorrect");
//    }
}
