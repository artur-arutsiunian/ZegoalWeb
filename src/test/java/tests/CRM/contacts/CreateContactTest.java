package tests.CRM.contacts;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.contacts.CreateContact;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class CreateContactTest extends CoreTestCase {

    @Test
    public void testCreateContact() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateContact CreateContact = new CreateContact(driver);
        CreateContact.CreateContactMethod();
    }
}
