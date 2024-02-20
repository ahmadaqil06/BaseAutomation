package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RpaChallange {
    WebDriverWait wait;
    WebDriver driver;

    public RpaChallange(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void inptAddress(String address){
        By adress = By.xpath("//input[@ng-reflect-name='labelAddress']");
        wait.until(ExpectedConditions.elementToBeClickable(adress)).sendKeys(address);
    }
    public void inptCompany(String company){
        By companyName = By.xpath("//input[@ng-reflect-name='labelCompanyName']");
        wait.until(ExpectedConditions.elementToBeClickable(companyName)).sendKeys(company);
    }

    public void inptFirstName(String fName){
        By firstName = By.xpath("//input[@ng-reflect-name='labelFirstName']");
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(fName);
    }

    public void inptLastName(String lName){
        By lastName = By.xpath("//input[@ng-reflect-name='labelLastName']");
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys(lName);
    }

    public void inptEmail(String email){
        By emailName = By.xpath("//input[@ng-reflect-name='labelEmail']");
        wait.until(ExpectedConditions.elementToBeClickable(emailName)).sendKeys(email);
    }

    public void inptRole(String rName){
        By roleName = By.xpath("//input[@ng-reflect-name='labelRole']");
        wait.until(ExpectedConditions.elementToBeClickable(roleName)).sendKeys(rName);
    }

    public void inptPhoneNumber(String pNumber){
        By phoneNumber = By.xpath("//input[@ng-reflect-name='labelPhone']");
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber)).sendKeys(pNumber);
    }

    public void btnSubmit(){
        By submit = By.xpath("//input[@value='Submit']");
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
    }


}
