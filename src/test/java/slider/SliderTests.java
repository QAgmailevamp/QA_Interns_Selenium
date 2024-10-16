package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest
{
    @Test
    public void testSlide()
    {
        String value = "4";
        var sliderPage = homePage.clickHSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
