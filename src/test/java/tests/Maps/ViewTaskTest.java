package tests.Maps;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.MapsPageObject.ViewTaskThroughMap;
import org.junit.Test;

public class ViewTaskTest extends CoreTestCase {

    @Test
    public void testMoveToTask() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        ViewTaskThroughMap ViewTaskThroughMap = new ViewTaskThroughMap(driver);
        ViewTaskThroughMap.moveToTaskThroughMap();
    }
}
