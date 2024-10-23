package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import static org.testng.Assert.assertTrue;

public class EditorTests extends BaseTest
{
    @Test
    public void crossPopup()
    {
        FramesPage framesPage = homePage.clickFramesPage();
        framesPage.crossPopup();
        framesPage.switchToEditArea();


        String content = framesPage.getText();
        System.out.println("Current editor content: " + content);

        assertTrue(content.isEmpty(),"Test failed: Editor access not allowed.");
    }

}
