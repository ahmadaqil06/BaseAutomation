package tests;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import static extentreports.ExtentTestManager.getTest;
import static extentreports.ExtentTestManager.startTest;

public class Test_Latihan1 extends BaseTest {

    /*@Test
    public void login (){
        startTest("QA demo", "Practice form");
        latihan1.practiceForm("Dewi", "Annisa", "anam.dewiannisa@gmail.com");
        getTest().log(Status.INFO, "Set fName, Lname, and email");

    }*/

    @Test (priority = 0)
    public void inputName(){
        startTest("Input name", "first name&last name");
        latihan1.inputName("Dewi", "Annisa");
        getTest().log(Status.INFO, "input name");
    }

    @Test (priority = 1)
    public void inputEmail(){
        startTest("Input email", "Email");
        latihan1.inputEmail("anam.dewiannisa@gmail.com");
        getTest().log(Status.INFO, "input email");
    }


    @Test (priority = 2)
    public void chooseGender(){
        scroll();
        startTest("Choose gender", "Gender");
        latihan1.chooseGender();
        getTest().log(Status.INFO, "choose gender");
    }

    @Test (priority = 3)
    public void inputPhoneNumber(){
        startTest("Input phone", "Phone");
        latihan1.inputPhoneNumber("081313084280");
        getTest().log(Status.INFO, "input phone");
    }
}
