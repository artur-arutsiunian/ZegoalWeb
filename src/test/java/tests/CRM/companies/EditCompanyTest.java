package tests.CRM.companies;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.companies.EditCompany;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class EditCompanyTest extends CoreTestCase {

    @Test
    public void testEditCompany() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        EditCompany EditCompany = new EditCompany(driver);
        EditCompany.editCompanyMethod();
    }
}
