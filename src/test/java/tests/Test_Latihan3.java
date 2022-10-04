package tests;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import static extentreports.ExtentTestManager.getTest;
import static extentreports.ExtentTestManager.startTest;

public class Test_Latihan3 extends BaseTest{

    @Test(priority = 0)
    public void loginAdmin(){
        startTest("Login As Admin", "Start");
        loginHRM.inputUName("Admin", "admin123");
        getTest().log(Status.INFO, "start");
        loginHRM.btnLogin();
    }

    @Test(priority = 1)
    public void navbar(){
        startTest("Click NavBar", "Start");
        latihan3.navBarAdmin();
        getTest().log(Status.INFO, "start");
        latihan3.inputName("Nama Saya");
        latihan3.drpUseRole();
    }
}
