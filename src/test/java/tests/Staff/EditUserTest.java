package tests.Staff;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.StaffPageObject.EditUser;
import org.junit.Test;

public class EditUserTest extends CoreTestCase {

    @Test
    public void testEditUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        EditUser EditUser = new EditUser(driver);
        EditUser.editUserMethod();
    }
}
