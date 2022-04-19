package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.CreateTaskPageObject;
import lib.ui.Task.Filter.AdditionalFilterTaskPageObject;
import lib.ui.Task.Filter.MainFilterTaskPageObject;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateTaskTest extends CoreTestCase {

    @Test
    public void testCreateTask() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CreateTaskPageObject CreateTaskPageObject = new CreateTaskPageObject(driver);
        CreateTaskPageObject.createTaskMethod();

        AdditionalFilterTaskPageObject AdditionalFilterTaskPageObject = new AdditionalFilterTaskPageObject(driver);
        AdditionalFilterTaskPageObject.changeAdditionalFilterCondition();

        MainFilterTaskPageObject MainFilterTaskPageObject = new MainFilterTaskPageObject(driver);
        MainFilterTaskPageObject.changeFilterCondition();
    }
}