package tests.Epic;

import lib.CoreTestCase;
import lib.ui.EpicPageObject.CreateEpic;
import lib.ui.LoginPageObject.Login;
import lib.ui.EpicPageObject.Filter.MainFilterEpic;
import org.junit.Test;

public class CreateEpicTest extends CoreTestCase {

    @Test
    public void testCreateEpic() throws InterruptedException{
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateEpic CreateEpic = new CreateEpic(driver);
        CreateEpic.createEpicMethod();

        MainFilterEpic MainFilterEpic = new MainFilterEpic(driver);
        MainFilterEpic.changeFilterCondition();
    }
}
