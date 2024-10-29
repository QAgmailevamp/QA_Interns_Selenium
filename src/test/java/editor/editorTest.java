package editor;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class editorTest extends BaseTest {

    @Test
    public void testEditor() {
        var editorpage = homepage.clickEditorPage();
        editorpage.closeButton();
        String text = editorpage.getText();
        Assert.assertEquals(text, "Your content goes here.");
    }
}