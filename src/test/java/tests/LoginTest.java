package tests;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class LoginTest extends CoreTestCase {

    @Test
    public void testLoginOnStartPage() throws InterruptedException{
        Login Login = new Login(driver);
        Login.loginMethod();
    }
}