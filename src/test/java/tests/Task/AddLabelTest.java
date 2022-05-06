package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.AddLabelToTask;
import lib.ui.TaskPageObject.Filter.AdditionalFilter;
import lib.ui.TaskPageObject.Filter.MainFilterTask;
import org.junit.Test;

public class AddLabelTest extends CoreTestCase {

    @Test
    public void testAddLabel() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AdditionalFilter AdditionalFilter = new AdditionalFilter(driver);
        AdditionalFilter.changeAdditionalFilterCondition();

        MainFilterTask MainFilterTask = new MainFilterTask(driver);
        MainFilterTask.changeFilterCondition();

        AddLabelToTask AddLabelToTask = new AddLabelToTask(driver);
        AddLabelToTask.addLabelMethod();
    }
}
