package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Remark.AddRemarkToTask;
import org.junit.Test;

public class AddRemarkTest extends CoreTestCase {

    @Test
    public void testAddRemark() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AddRemarkToTask AddRemarkToTask = new AddRemarkToTask(driver);
        AddRemarkToTask.addRemarkMethod();
    }
}
