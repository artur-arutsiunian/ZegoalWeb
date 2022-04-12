import PageObjects.Login.LoginPageObject;
import PageObjects.Task.CreateTaskPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest extends CoreTestCase{

    @Test
    public void testCreateTask() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CreateTaskPageObject CreateTaskPageObject = new CreateTaskPageObject(driver);
        CreateTaskPageObject.createTaskMethod();
    }
}