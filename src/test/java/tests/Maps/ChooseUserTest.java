package tests.Maps;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Maps.MoveToMapsPageObject;
import org.junit.Test;

public class ChooseUserTest extends CoreTestCase {

    @Test
    public void testChooseUser() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        MoveToMapsPageObject MoveToMapsPageObject = new MoveToMapsPageObject(driver);
        MoveToMapsPageObject.chooseUserOnMap();
    }
}
