package tests.Epic;

import lib.CoreTestCase;
import lib.ui.Epic.DeleteEpicPageObject;
import lib.ui.Login.LoginPageObject;
import org.junit.Test;

public class DeleteEpicTest extends CoreTestCase {

    @Test
    public void testDeleteEpic() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        DeleteEpicPageObject DeleteEpicPageObject = new DeleteEpicPageObject(driver);
        DeleteEpicPageObject.deleteEpicMethod();
    }
}
