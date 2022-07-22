package tests.CRM.contacts;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.contacts.MoveToInfoTabInContact;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class MoveToInfoTabInContactTest extends CoreTestCase {

    @Test
    public void testMoveToInfoTabInContact() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MoveToInfoTabInContact MoveToInfoTabInContact = new MoveToInfoTabInContact(driver);
        MoveToInfoTabInContact.moveToInfoTabInContactMethod();
    }
}
