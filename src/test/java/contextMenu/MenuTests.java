package contextMenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuTests extends BaseTest {

    @Test
    public void testContextMenu(){
        var menupage = homepage.clickContextMenu();
        menupage.clickOnContainer();
        String text = menupage.gettAlertText();
        Assert.assertEquals(text,"You selected a context menu","Incorrect message");
        menupage.dismissAlert();
    }
}
