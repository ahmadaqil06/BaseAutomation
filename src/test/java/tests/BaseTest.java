package tests;
import Pages.*;
import Utility.Data;
import extentreports.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import logs.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected Data setup;
    protected Latihan1 latihan1;
    protected Latihan2 latihan2;

    protected Latihan3 latihan3;

    protected DatePickertest datePickertest;

    protected LoginHRM loginHRM;
    protected WebDriver driver;
    protected WebDriverWait wait;
    public WebDriver getDriver(){
        return driver;
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i =0; i<1000; i+=7){
            js.executeScript("window.scrollTo(0, " + i + ")");
        }
    }

    @BeforeClass
    public void setUp(){
        setup = new Data();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Useradmin\\Documents\\Driverchrome\\chromedriver_win32\\chromedriver.exe");
        Log.info("Setup the browser");

        // Start in Chrome
        ChromeOptions chrome = new ChromeOptions();
        chrome.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chrome);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("Browser is opening");
        driver.get(setup.getUrlNewTab());
        driver.manage().window().maximize();
        //loginPage = new LoginPage(driver, wait);

        latihan1 = new Latihan1(driver, wait);
        latihan2 = new Latihan2(driver, wait);
        latihan3 = new Latihan3(driver, wait);
        loginHRM = new LoginHRM(driver, wait);
        datePickertest = new DatePickertest(driver, wait);
    }

    @AfterClass
    public void getResult(){
        //driver.quit();
    }
    @AfterSuite
    public void tearDown(){
        ExtentManager.extentReports.flush();
    }
}
