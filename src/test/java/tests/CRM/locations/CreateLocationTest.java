package tests.CRM.locations;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.locations.CreateLocation;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class CreateLocationTest extends CoreTestCase {

    @Test
    public void testCreateLocation() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateLocation CreateLocation = new CreateLocation(driver);
        CreateLocation.createLocationMethod();
    }
}
