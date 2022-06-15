package tests.CRM.companies;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.companies.DeleteCompany;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class DeleteCompanyTest extends CoreTestCase {

    @Test
    public void testDeleteCompany() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeleteCompany DeleteCompany = new DeleteCompany(driver);
        DeleteCompany.deleteCompanyMethod();
    }
}
