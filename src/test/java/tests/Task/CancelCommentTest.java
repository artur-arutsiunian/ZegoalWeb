package tests.Task;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.TaskPageObject.Comment.CancelCommentToTask;
import org.junit.Test;

public class CancelCommentTest extends CoreTestCase {

    @Test
    public void testCancelComment() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CancelCommentToTask CancelCommentToTask = new CancelCommentToTask(driver);
        CancelCommentToTask.cancelCommentMethod();
    }
}