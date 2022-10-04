package tests;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static extentreports.ExtentTestManager.getTest;
import static extentreports.ExtentTestManager.startTest;

public class Test_datePicker extends BaseTest {

    @Test(priority = 0)
    public void inputName(){
        startTest("Input name", "first name&last name");
        scroll();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");
        datePickertest.clickNewTab();
        //datePickertest.clickDate();
        datePickertest.clickBulan();
        getTest().log(Status.INFO, "input name");
    }

}
