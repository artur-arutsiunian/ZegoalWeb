package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.DeleteTaskPageObject;
import org.junit.Test;

public class DeleteTaskTest extends CoreTestCase {

    @Test
    public void testDeleteTask() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        DeleteTaskPageObject DeleteTaskPageObject = new DeleteTaskPageObject(driver);
        DeleteTaskPageObject.deleteTaskMethod();
    }
}