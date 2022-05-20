package tests.Staff;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.StaffPageObject.DeactivateUser;
import org.junit.Test;

public class DeactivateUserTest extends CoreTestCase {

    @Test
    public void testDeactivateUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeactivateUser DeactivateUser = new DeactivateUser(driver);
        DeactivateUser.deactivateUserMethod();
    }
}
