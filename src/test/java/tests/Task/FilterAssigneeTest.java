package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Filter.MainFilterTaskPageObject;
import org.junit.Test;

public class FilterAssigneeTest extends CoreTestCase {

    @Test
    public void testFilterAssignee() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        MainFilterTaskPageObject MainFilterTaskPageObject = new MainFilterTaskPageObject(driver);
        MainFilterTaskPageObject.changeFilterCondition();
    }
}
