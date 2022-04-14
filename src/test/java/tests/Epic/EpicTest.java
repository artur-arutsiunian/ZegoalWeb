package tests.Epic;

import lib.CoreTestCase;
import lib.ui.Epic.EpicPageObject;
import lib.ui.Login.LoginPageObject;
import org.junit.Test;

public class EpicTest extends CoreTestCase {

    @Test
    public void testCreateEpic() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        EpicPageObject EpicPageObject = new EpicPageObject(driver);
        EpicPageObject.createEpicMethod();

    }
}
