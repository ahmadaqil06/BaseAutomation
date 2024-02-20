package tests;
import Pages.*;
import Utility.Data;
import extentreports.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import logs.Log;
import org.openqa.selenium.JavascriptExecutor;
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

    protected RpaChallange challangeRpa; 
    protected TravelioTest travelioTest;

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
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("Browser is opening");
//        driver.get(setup.getUrlTravelio());
        driver.get("https://www.travelio.com");
        driver.manage().window().maximize();

        challangeRpa = new RpaChallange(driver, wait);
        travelioTest = new TravelioTest(driver);
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
