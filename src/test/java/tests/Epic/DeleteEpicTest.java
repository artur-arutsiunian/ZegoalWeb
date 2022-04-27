package tests.Epic;

import lib.CoreTestCase;
import lib.ui.Epic.DeleteEpicPageObject;
import lib.ui.Login.LoginPageObject;
import lib.ui.Task.Filter.epic.MainFilterEpicPageObject;
import lib.ui.Task.Filter.epic.MoveToEpicPageObject;
import org.junit.Test;

public class DeleteEpicTest extends CoreTestCase {

    @Test
    public void testDeleteEpic() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        MoveToEpicPageObject MoveToEpicPageObject = new MoveToEpicPageObject(driver);
        MoveToEpicPageObject.moveToEpicMethod();

        MainFilterEpicPageObject MainFilterEpicPageObject = new MainFilterEpicPageObject(driver);
        MainFilterEpicPageObject.changeFilterCondition();

        DeleteEpicPageObject DeleteEpicPageObject = new DeleteEpicPageObject(driver);
        DeleteEpicPageObject.deleteEpicMethod();
    }
}
