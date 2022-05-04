package tests.Staff;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.user.CreateUserPageObject;
import org.junit.Test;

public class CreateUserTest extends CoreTestCase {

    @Test
    public void testCreateUser() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CreateUserPageObject CreateUserPageObject = new CreateUserPageObject(driver);
        CreateUserPageObject.createUserMethod();
    }
}
