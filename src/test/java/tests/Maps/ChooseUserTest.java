package tests.Maps;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.MapsPageObject.MoveToMapsAndChooseUser;
import org.junit.Test;

public class ChooseUserTest extends CoreTestCase {

    @Test
    public void testChooseUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MoveToMapsAndChooseUser MoveToMapsAndChooseUser = new MoveToMapsAndChooseUser(driver);
        MoveToMapsAndChooseUser.chooseUserOnMap();
    }
}
