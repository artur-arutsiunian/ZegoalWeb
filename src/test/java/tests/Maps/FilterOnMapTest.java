package tests.Maps;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.MapsPageObject.FilterOnMaps;
import org.junit.Test;

public class FilterOnMapTest extends CoreTestCase {

    @Test
    public void testFilter() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        FilterOnMaps FilterOnMaps = new FilterOnMaps(driver);
        FilterOnMaps.changeFilterCondition();
    }
}
