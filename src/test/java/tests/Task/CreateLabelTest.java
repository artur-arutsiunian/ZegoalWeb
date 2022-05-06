package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Filter.AdditionalFilter;
import lib.ui.TaskPageObject.Filter.MainFilterTask;
import lib.ui.TaskPageObject.Label.CreateLabel;
import org.junit.Test;

public class CreateLabelTest extends CoreTestCase {

    @Test
    public void testCreateLabel() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AdditionalFilter AdditionalFilter = new AdditionalFilter(driver);
        AdditionalFilter.changeAdditionalFilterCondition();

        MainFilterTask MainFilterTask = new MainFilterTask(driver);
        MainFilterTask.changeFilterCondition();

        CreateLabel CreateLabel = new CreateLabel(driver);
        CreateLabel.createLabelMethod();
    }
}
