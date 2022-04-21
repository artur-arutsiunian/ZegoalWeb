package tests.Epic;

import lib.CoreTestCase;
import lib.ui.Epic.CreateEpicPageObject;
import lib.ui.Login.LoginPageObject;
import org.junit.Test;

public class CreateEpicTest extends CoreTestCase {

    @Test
    public void testCreateEpic() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        CreateEpicPageObject CreateEpicPageObject = new CreateEpicPageObject(driver);
        CreateEpicPageObject.createEpicMethod();

    }
}
