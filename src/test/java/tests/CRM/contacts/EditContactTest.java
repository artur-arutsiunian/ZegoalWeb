package tests.CRM.contacts;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.contacts.EditContact;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class EditContactTest extends CoreTestCase {

    @Test
    public void testEditContact() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        EditContact EditContact = new EditContact(driver);
        EditContact.editContactMethod();
    }
}
