package tests.CRM.locations;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.locations.DeleteLocation;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class DeleteLocationTest extends CoreTestCase {

    @Test
    public void testDeleteLocation() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeleteLocation DeleteLocation = new DeleteLocation(driver);
        DeleteLocation.deleteLocationMethod();
    }
}
