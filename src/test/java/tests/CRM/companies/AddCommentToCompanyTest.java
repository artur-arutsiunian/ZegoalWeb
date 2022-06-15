package tests.CRM.companies;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.companies.AddCommentToCompany;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class AddCommentToCompanyTest extends CoreTestCase {

    @Test
    public void testAddCommentToCompany() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AddCommentToCompany AddCommentToCompany = new AddCommentToCompany(driver);
        AddCommentToCompany.addCommentToCompanyMethod();
    }
}
