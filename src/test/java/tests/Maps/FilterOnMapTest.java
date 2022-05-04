package tests.Maps;

import lib.CoreTestCase;
import lib.ui.Login.LoginPageObject;
import lib.ui.Maps.FilterOnMapsPageObject;
import org.junit.Test;

public class FilterOnMapTest extends CoreTestCase {

    @Test
    public void testFilter() throws InterruptedException {
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        FilterOnMapsPageObject FilterOnMapsPageObject = new FilterOnMapsPageObject(driver);
        FilterOnMapsPageObject.changeFilterCondition();
    }
}
