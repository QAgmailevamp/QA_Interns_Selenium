package uploadFile;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class uploadTest extends BaseTest {

    @Test
    public void uploadFileTest(){
        var uploadfilepage = homepage.clickFileUploadPage();
        uploadfilepage.chooseFile("D:\\JetBrains\\QA_Interns_Selenium\\.gitignore");
        Assert.assertEquals(uploadfilepage.getResult(),".gitignore","Message not found");
    }
}
