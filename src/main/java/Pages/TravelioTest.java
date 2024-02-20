package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelioTest {
    WebDriverWait wait;
    WebDriver driver;

    public TravelioTest(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void btnLogin() {
        By login = By.xpath("//button[@id='login-modal-btn']");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    public void closePopUpLogin() {
        By closePopUP = By.xpath("//div[@id='close-login-modal-icon']");
        wait.until(ExpectedConditions.elementToBeClickable(closePopUP)).click();
    }

    public void closePopUp() {
        By login = By.xpath("//*[@id=\"tpmModal\"]/div/div/div/i");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    public void clickLogin() {
        By login = By.xpath("//div[@onclick=\"openLoginRegisterModal('login')\"]");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    public void dashboard() {
        By login = By.xpath("//div[@onclick=\"openLoginRegisterModal('login')\"]");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    public void inptEmail(String email) {
        By inptemail = By.xpath("//input[@id='login-email']");
        wait.until(ExpectedConditions.elementToBeClickable(inptemail)).sendKeys(email);
    }

    public void inptPass(String pass) {
        By inptpass = By.xpath("//input[@id='login-password']");
        wait.until(ExpectedConditions.elementToBeClickable(inptpass)).sendKeys(pass);
    }

    public void clickEyeSlash() {
        By eyeslash = By.xpath("//div[@id='login-modal-sign-in']//i[@class='fa fa-eye-slash icon-show-password']");
        wait.until(ExpectedConditions.elementToBeClickable(eyeslash)).click();
    }

    public void rememberLogin() {
        By login = By.xpath("//input[@id='login-remember']");
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }

    public void errorMessageOk() {
        By btnOk = By.xpath("//button[normalize-space()='OK']");
        wait.until(ExpectedConditions.elementToBeClickable(btnOk)).click();
    }

    public void userOptions() {
        By usrOpt = By.xpath("//div[@id='user-option']");
        wait.until(ExpectedConditions.elementToBeClickable(usrOpt)).click();
    }

    public void profileUser() {
        By profileUsr = By.xpath("//a[@href='//www.travelio.com/user']");
        wait.until(ExpectedConditions.elementToBeClickable(profileUsr)).click();
    }


}
