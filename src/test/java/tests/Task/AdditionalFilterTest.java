package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Filter.AdditionalFilterTaskPageObject;
import org.junit.Test;

public class AdditionalFilterTest extends CoreTestCase {

    @Test
    public void testAdditionalTest() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        AdditionalFilterTaskPageObject AdditionalFilterTaskPageObject = new AdditionalFilterTaskPageObject(driver);
        AdditionalFilterTaskPageObject.changeAdditionalFilterCondition();
    }
}
