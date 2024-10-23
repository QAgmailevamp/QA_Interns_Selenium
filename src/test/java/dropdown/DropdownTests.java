package dropdown;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropDownPage = homepage.clickDropdown();
        String option  = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedoptions();
        Assert.assertEquals(selectedOptions.size(),1,"Incorect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
