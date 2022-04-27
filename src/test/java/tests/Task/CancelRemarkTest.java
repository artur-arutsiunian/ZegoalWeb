package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Remark.CancelRemarkToTaskPageObject;
import org.junit.Test;

public class CancelRemarkTest extends CoreTestCase {

    @Test
    public void testCancelRemark() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CancelRemarkToTaskPageObject CancelRemarkToTaskPageObject = new CancelRemarkToTaskPageObject(driver);
        CancelRemarkToTaskPageObject.cancelRemarkMethod();
    }
}