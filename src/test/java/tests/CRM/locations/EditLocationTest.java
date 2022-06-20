package tests.CRM.locations;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.locations.EditLocation;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class EditLocationTest extends CoreTestCase {

    @Test
    public void testEditLocation() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        EditLocation EditLocation = new EditLocation(driver);
        EditLocation.editLocationMethod();
    }
}
