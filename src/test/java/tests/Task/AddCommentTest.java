package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Comment.AddCommentToTaskPageObject;
import org.junit.Test;

public class AddCommentTest extends CoreTestCase {

    @Test
    public void testAddComment() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        AddCommentToTaskPageObject AddCommentToTaskPageObject = new AddCommentToTaskPageObject(driver);
        AddCommentToTaskPageObject.addCommentMethod();
    }
}
