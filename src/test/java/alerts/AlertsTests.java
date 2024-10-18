package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTest
{
    @Test
    public void testAcceptAlerts()
    {
       var alertsPage = homePage.clickJavaScriptAlerts();
       alertsPage.triggerAlert();
       alertsPage.alert_clickToAccept();
       assertEquals(alertsPage.getResult(),
               "You successfully clicked an alert",
               "Results text incorrect");

    }

    @Test
    public void testGetTextFromAlert()
    {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,
                "I am a JS Confirm",
                "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert()
    {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text = "cheen tapak dum dum";
        alertsPage.alert_getInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),
                "You entered: " + text,
                "Results text incorrect");
    }

}
