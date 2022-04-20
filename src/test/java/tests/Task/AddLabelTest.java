package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.AddLabelToTaskPageObject;
import lib.ui.Task.Filter.AdditionalFilterTaskPageObject;
import lib.ui.Task.Filter.MainFilterTaskPageObject;
import org.junit.Test;

public class AddLabelTest extends CoreTestCase {

    @Test
    public void testAddLabel() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        AdditionalFilterTaskPageObject AdditionalFilterTaskPageObject = new AdditionalFilterTaskPageObject(driver);
        AdditionalFilterTaskPageObject.changeAdditionalFilterCondition();

        MainFilterTaskPageObject MainFilterTaskPageObject = new MainFilterTaskPageObject(driver);
        MainFilterTaskPageObject.changeFilterCondition();

        AddLabelToTaskPageObject AddLabelToTaskPageObject = new AddLabelToTaskPageObject(driver);
        AddLabelToTaskPageObject.addLabelMethod();
    }
}
