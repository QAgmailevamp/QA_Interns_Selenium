package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CMTests extends BaseTest
{
    @Test
    public void testRightClick()
    {
        var cmPage = homePage.clickContextMenu();
        cmPage.rightClick();
        String alertbox = cmPage.msgAlert();
        cmPage.clickOk();
        assertEquals(alertbox, "You selected a context menu", "wrong");
    }

}
