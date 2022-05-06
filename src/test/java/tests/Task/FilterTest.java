package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Filter.SearchFilterTask;
import org.junit.Test;

public class FilterTest extends CoreTestCase {

    @Test
    public void testFilter() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        SearchFilterTask SearchFilterTask = new SearchFilterTask(driver);
        SearchFilterTask.inputDataInsideField();
    }
}
