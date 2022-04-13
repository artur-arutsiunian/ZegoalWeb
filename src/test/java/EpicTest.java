import PageObjects.Epic.EpicPageObject;
import PageObjects.Login.LoginPageObject;
import org.junit.Test;

public class EpicTest extends CoreTestCase{

    @Test
    public void testCreateEpic() throws InterruptedException{
        LoginPageObject LoginPageObject = new LoginPageObject(driver);
        LoginPageObject.loginMethod();

        EpicPageObject EpicPageObject = new EpicPageObject(driver);
        EpicPageObject.createEpicMethod();

    }
}
