package tests;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import org.junit.Test;

public class LoginTest extends CoreTestCase {

    @Test
    public void testLoginOnStartPage() throws InterruptedException{
        LoginPageObject loginPageObject = new LoginPageObject(driver);
        loginPageObject.loginMethod();
    }
}