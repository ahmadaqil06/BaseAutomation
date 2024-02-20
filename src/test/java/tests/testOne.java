package tests;

import Pages.TravelioTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testOne {

    private WebDriver driver;
    private TravelioTest loginPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver");
        driver = new ChromeDriver();
        loginPage = new TravelioTest(driver);
    }

    @Test
    public void testLogin() {
        driver.get("https://www.travelio.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        loginPage.clickLogin();


//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
//        loginButton.click();
//
//        WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
//        emailInput.sendKeys("test@example.com");
//
//        WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
//        passwordInput.sendKeys("password");
//
//        loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
//        loginButton.click();
//
//        WebElement dashboard = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dashboard']")));
//        Assert.assertTrue(dashboard.isDisplayed());
    }
}