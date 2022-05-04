package tests.Task;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Remark.DeleteRemarkTaskPageObject;
import org.junit.Test;

public class DeleteRemarkTest extends CoreTestCase {

    @Test
    public void testDeleteRemark() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        DeleteRemarkTaskPageObject DeleteRemarkTaskPageObject = new DeleteRemarkTaskPageObject(driver);
        DeleteRemarkTaskPageObject.deleteRemarkMethod();
    }
}
