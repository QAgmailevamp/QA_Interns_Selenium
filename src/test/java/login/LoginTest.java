package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.secureAreaPage;

@Test
public class LoginTest extends BaseTest {
    public void testSuccesfullLogin() {
        LoginPage loginpage = homepage.clickFromAuth();
        loginpage.userName("tomsmith");
        loginpage.Password("SuperSecretPassword!");
        secureAreaPage securearea = loginpage.clickLoginButton();
        Assert.assertTrue(securearea.getAlert()
                .contains("You logged into a secure area!"),"Alert text is incorrect");
    }
}
