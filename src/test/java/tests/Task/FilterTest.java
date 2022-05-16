package tests.Task;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Filter.SearchFilterTask;
import org.junit.Test;

public class FilterTest extends CoreTestCase {

    @Test
    @DisplayName("Check work of search filed on the task page")
    @Description("We enter id task in search field then delete and make sure id is deleted")
    public void testFilter() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        SearchFilterTask SearchFilterTask = new SearchFilterTask(driver);
        SearchFilterTask.inputDataInsideField();
    }
}
