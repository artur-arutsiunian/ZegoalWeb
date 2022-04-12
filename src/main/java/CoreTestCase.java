import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreTestCase {


    protected WebDriver driver;
    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","/Users/arturarutsiunian/Documents/ZegoalWeb/src/main/resources/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://testing7.zgdev.info/auth");
        driver.manage().window().maximize();

    }

    @After
    public void Close(){
        driver.close();
    }}