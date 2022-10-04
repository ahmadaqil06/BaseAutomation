package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DatePickertest {
    WebDriverWait wait;
    WebDriver driver;
    public DatePickertest(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void clickNewTab(){
        By baru = By.xpath("//input[@id='dateOfBirthInput']");
        wait.until(ExpectedConditions.elementToBeClickable(baru)).click();
    }

    public void clickDate(){
        By dt = By.xpath("//div[@aria-label='Choose Friday, October 21st, 2022']");
        wait.until(ExpectedConditions.elementToBeClickable(dt)).click();
    }

    public void clickBulan(){
        By file = By.xpath("//*[@id=\"uploadPicture\"]");
        wait.until(ExpectedConditions.elementToBeClickable(file)).click();
    }
}
