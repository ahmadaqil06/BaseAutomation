package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Latihan1 {
    WebDriverWait wait;
    WebDriver driver;
    public Latihan1 (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    /* public void practiceForm(String fName,String lName, String email){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        By element = By.xpath(("//h5[normalize-space()='Elements']"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

        By elementForm = By.xpath(("//div[normalize-space()='Forms']"));
        wait.until(ExpectedConditions.elementToBeClickable(elementForm)).click();

        By elementFormPractice = By.xpath(("//span[normalize-space()='Practice Form']"));
        wait.until(ExpectedConditions.elementToBeClickable(elementFormPractice)).click();

    }*/

    public void inputName(String fName, String lName){
        By inputfName = By.xpath("//input[@id='firstName']");
        wait.until(ExpectedConditions.elementToBeClickable(inputfName)).sendKeys(fName);

        By inputlName = By.xpath("//input[@id='lastName']");
        wait.until(ExpectedConditions.elementToBeClickable(inputlName)).sendKeys(lName);
    }

    public void inputEmail(String email){
        By inputemail = By.xpath("//input[@id='userEmail']");
        wait.until(ExpectedConditions.elementToBeClickable(inputemail)).sendKeys(email);
    }

    public void chooseGender(){
        By rbMale = By.xpath(("//label[normalize-space()='Female']"));
        wait.until(ExpectedConditions.elementToBeClickable(rbMale)).click();
    }

    public void inputPhoneNumber(String phoneNum){
        By inputPhone = By.xpath(("//input[@id='userNumber']"));
        wait.until(ExpectedConditions.elementToBeClickable(inputPhone)).sendKeys(phoneNum);
    }

}
