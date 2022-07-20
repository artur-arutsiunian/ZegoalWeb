package tests.CRM.contacts;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.contacts.DeleteContact;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class DeleteContactTest extends CoreTestCase {

    @Test
    public void testDeleteContact() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeleteContact DeleteContact = new DeleteContact(driver);
        DeleteContact.deleteContactMethod();
    }
}
