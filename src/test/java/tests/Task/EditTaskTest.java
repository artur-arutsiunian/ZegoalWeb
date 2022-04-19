package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.EditTaskPageObject;
import lib.ui.Task.Filter.AdditionalFilterTaskPageObject;
import lib.ui.Task.Filter.MainFilterTaskPageObject;
import org.junit.Test;

public class EditTaskTest extends CoreTestCase {

    @Test
    public void testEditTask() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        AdditionalFilterTaskPageObject AdditionalFilterTaskPageObject = new AdditionalFilterTaskPageObject(driver);
        AdditionalFilterTaskPageObject.changeAdditionalFilterCondition();

        MainFilterTaskPageObject MainFilterTaskPageObject = new MainFilterTaskPageObject(driver);
        MainFilterTaskPageObject.changeFilterCondition();

        EditTaskPageObject EditTaskPageObject = new EditTaskPageObject(driver);
        EditTaskPageObject.editTaskMethod();
    }
}
