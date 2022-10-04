package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Latihan3 {
    WebDriver driver;
    WebDriverWait wait;

    public Latihan3 (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    public void navBarAdmin(){
        By btnAdmin = By.xpath("//span[normalize-space()='Admin']");
        wait.until(ExpectedConditions.elementToBeClickable(btnAdmin)).click();
    }

    public void inputName(String uName){
        By name = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
        wait.until(ExpectedConditions.elementToBeClickable(name)).sendKeys(uName);
    }

    public void drpUseRole(){
        By drp = By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div");
        wait.until(ExpectedConditions.elementToBeClickable(drp)).click();
        wait.until(ExpectedConditions.elementToBeClickable(drp)).click();
    }
}
