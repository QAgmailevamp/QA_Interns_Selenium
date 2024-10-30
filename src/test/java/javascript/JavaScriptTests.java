package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTest
{
    @Test
    public void testScroll()
    {
        homePage.clickLnDDOM().scrollToTable();
    }

    @Test
    public void testScrollToFifthPara()
    {
        homePage.clickInfiniteScroll().scrollToParagraph(5);

    }

    @Test
    public void testAdd() {

        var dropDownPage = homePage.clickDropdown();
        dropDownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
