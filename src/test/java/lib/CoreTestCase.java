package lib;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class CoreTestCase {

    protected WebDriver driver;
    protected ChromeOptions options;
    @Before
    public void SetUp(){
       System.setProperty("webdriver.chrome.driver","/Users/arturarutsiunian/Documents/ZegoalWeb/src/main/resources/chromedriver");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);

        driver.get("https://testing7.zgdev.info/auth");
        driver.manage().window().maximize();
    }

    @After
    public void Close(){
        driver.close();
    }}