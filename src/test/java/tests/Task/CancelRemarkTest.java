package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Remark.CancelRemarkToTask;
import org.junit.Test;

public class CancelRemarkTest extends CoreTestCase {

    @Test
    public void testCancelRemark() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CancelRemarkToTask CancelRemarkToTask = new CancelRemarkToTask(driver);
        CancelRemarkToTask.cancelRemarkMethod();
    }
}