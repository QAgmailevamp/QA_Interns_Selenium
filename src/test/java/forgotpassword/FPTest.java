package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FPPage;
import pages.MsgPage;

import static org.testng.Assert.assertTrue;

public class FPTest extends BaseTest
{
    @Test
    public void test()
    {
     FPPage fpPage =  homePage.clickFP();
      fpPage.setEmail("chandler@bing.com");

     MsgPage msgPage = fpPage.clickRetButton();
     assertTrue(msgPage.getMsgText().contains(
             "Your email was sent"),
             "Error");
    }
}
