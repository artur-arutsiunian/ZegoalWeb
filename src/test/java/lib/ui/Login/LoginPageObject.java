package lib.ui.Login;

import lib.ui.MainPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends MainPageObject {

    private static final String
    LOGIN = "//input[@name='email']",
    PASSWORD = "//input[@name='password']",
    LOG_IN_BUTTON = "//span[text()='Login']";


    public LoginPageObject(WebDriver driver)
    {
        super(driver);
    }

    public void loginMethod() throws InterruptedException{
        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(LOGIN),
                "newemail@mail.ru",
                "Can't find 'Login' field",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndSendKeys(
                By.xpath(PASSWORD),
                "Wimix1",
                "Can't find 'Password' field",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(LOG_IN_BUTTON),
                "Can't find 'Log in button'",
                5
        );
    }

}
