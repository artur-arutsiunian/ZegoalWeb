package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.CreateTaskPageObject;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest extends CoreTestCase {

    @Test
    public void testCreateTask() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CreateTaskPageObject CreateTaskPageObject = new CreateTaskPageObject(driver);
        CreateTaskPageObject.createTaskMethod();
    }
}