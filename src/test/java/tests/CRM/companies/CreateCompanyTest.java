package tests.CRM.companies;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.companies.CreateCompany;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class CreateCompanyTest extends CoreTestCase {

    @Test
    public void testCreateCompany() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateCompany CreateCompany = new CreateCompany(driver);
        CreateCompany.createCompanyMethod();
    }
}
