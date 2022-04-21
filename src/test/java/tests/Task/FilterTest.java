package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Filter.SearchFilterTaskPageObject;
import org.junit.Test;

public class FilterTest extends CoreTestCase {

    @Test
    public void testFilter() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        SearchFilterTaskPageObject SearchFilterTaskPageObject = new SearchFilterTaskPageObject(driver);
        SearchFilterTaskPageObject.inputDataInsideField();
    }
}
