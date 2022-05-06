package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.DeleteTask;
import org.junit.Test;

public class DeleteTaskTest extends CoreTestCase {

    @Test
    public void testDeleteTask() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeleteTask DeleteTask = new DeleteTask(driver);
        DeleteTask.deleteTaskMethod();
    }
}