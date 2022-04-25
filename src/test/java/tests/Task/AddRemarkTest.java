package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.AddRemarkToTaskPageObject;
import org.junit.Test;

public class AddRemarkTest extends CoreTestCase {

    @Test
    public void testAddRemark() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        AddRemarkToTaskPageObject AddRemarkToTaskPageObject = new AddRemarkToTaskPageObject(driver);
        AddRemarkToTaskPageObject.addRemarkMethod();
    }
}
