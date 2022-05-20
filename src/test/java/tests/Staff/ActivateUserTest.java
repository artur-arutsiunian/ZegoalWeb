package tests.Staff;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.StaffPageObject.ActivateUser;
import org.junit.Test;

public class ActivateUserTest extends CoreTestCase {

    @Test
    public void testActivateUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        ActivateUser ActivateUser = new ActivateUser(driver);
        ActivateUser.activateUserMethod();
    }
}
