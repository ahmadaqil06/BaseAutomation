package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHRM {

    WebDriverWait wait;
    WebDriver driver;

    public LoginHRM(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void inputUName (String uName, String pass){
        By username = By.xpath("//input[@placeholder='Username']");
        wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(uName);

        By passW = By.xpath("//input[@placeholder='Password']");
        wait.until(ExpectedConditions.elementToBeClickable(passW)).sendKeys(pass);
    }

    public void btnLogin(){
        By btn = By.xpath("//button[normalize-space()='Login']");
        wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
    }


}
