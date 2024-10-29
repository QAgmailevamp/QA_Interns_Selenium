package alert;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertsTest extends BaseTest {

    @Test
    public void acceptAlert(){
        var alertpage = homepage.clickAlertsPage();
        alertpage.triggerAlert();
        alertpage.acceptAlert();
        Assert.assertEquals(alertpage.getResult(),"You successfully clicked an alert");
    }
    @Test
    public void testconfirmAlert(){
        var confirmalertpage = homepage.clickAlertsPage();
        confirmalertpage.triggerconfirm();
        Assert.assertEquals(confirmalertpage.getconfirmText(),"I am a JS Confirm");
        confirmalertpage.dismissConfirm();
    }
    @Test
    public void promptTest(){
        var promptpage = homepage.clickAlertsPage();
        promptpage.triggerPrompt();
        promptpage.enterPrompt("TAU University");
        promptpage.getText();
    }
}
