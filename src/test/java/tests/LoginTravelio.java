package tests;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import static extentreports.ExtentTestManager.startTest;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static extentreports.ExtentTestManager.getTest;

public class LoginTravelio extends BaseTest {

    @Test
    public void negativeCaselogin() {
        startTest("Negative Case Login With Wrong Email", "Login Travelio With Email");
        travelioTest.closePopUp();
        getTest().log(Status.INFO, "Close PopUp");
        travelioTest.clickLogin();
        getTest().log(Status.INFO, "Click Button Login");
        travelioTest.inptEmail("aqil@gmail.com");
        getTest().log(Status.INFO, "Input wrong email");
        travelioTest.inptPass("aqil@gmail.com");
        getTest().log(Status.INFO, "Input wrong pass");
        travelioTest.btnLogin();
        getTest().log(Status.INFO, "Click button login");

        WebElement errorMessage = driver.findElement(By.xpath("//div[@id='modal-error-message']"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Email atau password salah";
        actualErrorMessage.equals(expectedErrorMessage);

        getTest().log(Status.INFO, "Verifikasi actual text dari error message");
        travelioTest.errorMessageOk();
        travelioTest.closePopUpLogin();
    }

    @Test
    public void positiveCaselogin() {
        startTest("Login With Email", "Login Travelio With Email");
        travelioTest.clickLogin();
        getTest().log(Status.INFO, "Click Button Login");
        travelioTest.inptEmail(setup.getEmailTravelio());
        getTest().log(Status.INFO, "Input Email");
        travelioTest.inptPass(setup.getPassTravelio());
        getTest().log(Status.INFO, "Input Password");
        travelioTest.rememberLogin();
        getTest().log(Status.INFO, "Click button remember login");
        travelioTest.rememberLogin();
        getTest().log(Status.INFO, "Click button remember login again");
        travelioTest.btnLogin();
        getTest().log(Status.INFO, "Click button login");
        travelioTest.userOptions();
        getTest().log(Status.INFO, "Click dropdown User Option");
        travelioTest.profileUser();
        getTest().log(Status.INFO, "Click button 'Profile Saya'");
        
        WebElement profileName = driver.findElement(By.xpath("//div[normalize-space()='Ahmad Aqil']"));
        String actualProfileName = profileName.getText();
        String expectedProfileName = "Ahmad Aqil";
        actualProfileName.equals(expectedProfileName);

        driver.navigate().back();
        getTest().log(Status.INFO, "Back to dashboard");
    }
}
