package tests.CRM.locations;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.locations.AddCommentToLocation;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class AddCommentToLocationTest extends CoreTestCase {

    @Test
    public void testAddCommentToLocation() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AddCommentToLocation AddCommentToLocation = new AddCommentToLocation(driver);
        AddCommentToLocation.addCommentToLocationMethod();
    }
}
