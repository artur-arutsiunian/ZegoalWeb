package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Comment.CancelCommentToTaskPageObject;
import org.junit.Test;

public class CancelCommentTest extends CoreTestCase {

    @Test
    public void testCancelComment() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CancelCommentToTaskPageObject CancelCommentToTaskPageObject = new CancelCommentToTaskPageObject(driver);
        CancelCommentToTaskPageObject.cancelCommentMethod();
    }
}