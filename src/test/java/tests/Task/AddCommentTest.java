package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Comment.AddCommentToTask;
import org.junit.Test;

public class AddCommentTest extends CoreTestCase {

    @Test
    public void testAddComment() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AddCommentToTask AddCommentToTask = new AddCommentToTask(driver);
        AddCommentToTask.addCommentMethod();
    }
}
