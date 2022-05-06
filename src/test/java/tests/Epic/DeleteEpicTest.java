package tests.Epic;

import lib.CoreTestCase;
import lib.ui.EpicPageObject.DeleteEpic;
import lib.ui.LoginPageObject.Login;
import lib.ui.EpicPageObject.Filter.MainFilterEpic;
import lib.ui.EpicPageObject.MoveToEpic;
import org.junit.Test;

public class DeleteEpicTest extends CoreTestCase {

    @Test
    public void testDeleteEpic() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MoveToEpic MoveToEpic = new MoveToEpic(driver);
        MoveToEpic.moveToEpicMethod();

        MainFilterEpic MainFilterEpic = new MainFilterEpic(driver);
        MainFilterEpic.changeFilterCondition();

        DeleteEpic DeleteEpic = new DeleteEpic(driver);
        DeleteEpic.deleteEpicMethod();
    }
}
