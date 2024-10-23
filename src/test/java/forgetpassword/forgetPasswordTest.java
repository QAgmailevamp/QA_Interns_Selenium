package forgetpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPassword;

public class forgetPasswordTest extends BaseTest {
    @Test
    public void resetPassword(){
        var forgetpasswordpage = homepage.clickForgotPasswordPage();
        forgetpasswordpage.enterEmail();
        forgetpasswordpage.clickButton();
    }
}
