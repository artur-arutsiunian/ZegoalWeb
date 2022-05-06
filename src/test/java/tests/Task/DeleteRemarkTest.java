package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Remark.DeleteRemarkToTask;
import org.junit.Test;

public class DeleteRemarkTest extends CoreTestCase {

    @Test
    public void testDeleteRemark() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeleteRemarkToTask DeleteRemarkToTask = new DeleteRemarkToTask(driver);
        DeleteRemarkToTask.deleteRemarkMethod();
    }
}
