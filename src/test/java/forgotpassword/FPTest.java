package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.FPPage;

import static org.testng.Assert.assertTrue;

public class FPTest extends BaseTest
{
    @Test
    public void test()
    {
     FPPage fpPage =  homePage.clickFP();
      fpPage.setEmail("chandler@bing.com");

     AlertPage alertPage = fpPage.clickRetButton();
     assertTrue(alertPage.getAlertText().contains(
             "Your email was sent"),
             "Error");
    }
}
