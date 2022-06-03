package tests.Maps;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.MapsPageObject.MoveToMapsAndChooseUser;
import org.junit.Test;

@Epic("Test for Map page")
public class ChooseUserTest extends CoreTestCase {

    @Test
    @Features(value = {@Feature(value = "Ability to choose user"),@Feature(value = "Check pagination and correct number of users in the list")})
    public void testChooseUser() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MoveToMapsAndChooseUser MoveToMapsAndChooseUser = new MoveToMapsAndChooseUser(driver);
        MoveToMapsAndChooseUser.chooseUserOnMap();
    }
}
