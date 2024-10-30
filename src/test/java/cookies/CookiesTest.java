package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utils.CookieManager;

import static org.testng.Assert.assertFalse;

public class CookiesTest extends BaseTest
{
    public CookieManager getCookiemanager()
    {
        return new CookieManager(driver);
    }

    @Test
    public void testDeleteCookie(){

        var cookieManager = getCookiemanager();
        Cookie cookie = cookieManager.setCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
