package tests.Staff;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.StaffPageObject.SearchUser;
import org.junit.Test;

public class SearchUserTest extends CoreTestCase {

    @Test
    public void testSearchUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        SearchUser SearchUser = new SearchUser(driver);
        SearchUser.searchUserMethod();
    }
}
