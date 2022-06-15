package tests.CRM.companies;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.companies.MoveToInfoTab;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class MoveToInfoTabTest extends CoreTestCase {

    @Test
    public void testMoveToInfoTab() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MoveToInfoTab MoveToInfoTab = new MoveToInfoTab(driver);
        MoveToInfoTab.moveToInfoTabMethod();
    }
}
