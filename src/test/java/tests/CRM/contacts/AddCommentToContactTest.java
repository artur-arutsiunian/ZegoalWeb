package tests.CRM.contacts;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.contacts.AddCommentToContact;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class AddCommentToContactTest extends CoreTestCase {

    @Test
    public void testAddCommentToContact() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AddCommentToContact AddCommentToContact = new AddCommentToContact(driver);
        AddCommentToContact.addCommentToContactMethod();
    }
}
