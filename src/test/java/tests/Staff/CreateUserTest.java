package tests.Staff;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.StaffPageObject.CreateUser;
import org.junit.Test;

public class CreateUserTest extends CoreTestCase {

    @Test
    public void testCreateUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateUser CreateUser = new CreateUser(driver);
        CreateUser.createUserMethod();
    }
}
