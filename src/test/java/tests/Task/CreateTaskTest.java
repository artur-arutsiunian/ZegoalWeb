package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.CreateTask;
import lib.ui.TaskPageObject.Filter.AdditionalFilter;
import lib.ui.TaskPageObject.Filter.MainFilterTask;
import org.junit.Test;

public class CreateTaskTest extends CoreTestCase {

    @Test
    public void testCreateTask() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateTask CreateTask = new CreateTask(driver);
        CreateTask.createTaskMethod();

        AdditionalFilter AdditionalFilter = new AdditionalFilter(driver);
        AdditionalFilter.changeAdditionalFilterCondition();

        MainFilterTask MainFilterTask = new MainFilterTask(driver);
        MainFilterTask.changeFilterCondition();
    }
}