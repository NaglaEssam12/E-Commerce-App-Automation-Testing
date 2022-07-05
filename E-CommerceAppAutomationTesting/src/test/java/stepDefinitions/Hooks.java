package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;
    public static P01_register registerClass = null;
    public static P02_login loginClass = null;
    public static P03_homePage homePageClass = null;
    @Before
    public static void openBrowser()
    {
        // 1- Bridge
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        /*String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);*/

        //2- create object from Chrome Browser
        driver = new ChromeDriver();
        registerClass = new P01_register();
        loginClass = new P02_login();
        homePageClass = new P03_homePage();
        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.get("https://demo.nopcommerce.com/");

    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }

}
