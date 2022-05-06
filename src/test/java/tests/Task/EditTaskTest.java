package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.EditTask;
import lib.ui.TaskPageObject.Filter.AdditionalFilter;
import lib.ui.TaskPageObject.Filter.MainFilterTask;
import org.junit.Test;

public class EditTaskTest extends CoreTestCase {

    @Test
    public void testEditTask() throws InterruptedException {

        Login Login = new Login(driver);
        Login.loginMethod();

        AdditionalFilter AdditionalFilter = new AdditionalFilter(driver);
        AdditionalFilter.changeAdditionalFilterCondition();

        MainFilterTask MainFilterTask = new MainFilterTask(driver);
        MainFilterTask.changeFilterCondition();

        EditTask EditTask = new EditTask(driver);
        EditTask.editTaskMethod();
    }
}
