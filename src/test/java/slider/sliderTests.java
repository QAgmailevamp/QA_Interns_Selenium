package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sliderTests extends BaseTest {

    @Test
    public void testSlider(){
        var sliderpage = homepage.clickSliderPage();
        sliderpage.clickSlider();
        Assert.assertEquals(sliderpage.getResult(),"4","Incorrect number");
    }
}
