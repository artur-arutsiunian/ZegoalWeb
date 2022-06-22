package tests.CRM.locations;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.locations.MoveToInfoTabInLocation;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class MoveToInfoTabInLocationTest extends CoreTestCase {

    @Test
    public void testMoveToInfoTabInLocation() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MoveToInfoTabInLocation MoveToInfoTabInLocation = new MoveToInfoTabInLocation(driver);
        MoveToInfoTabInLocation.moveToInfoTabInLocationMethod();
    }
}
