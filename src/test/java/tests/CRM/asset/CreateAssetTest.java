package tests.CRM.asset;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.assets.CreateAsset;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class CreateAssetTest extends CoreTestCase {

    @Test
    public void testCreateAsset() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CreateAsset CreateAsset = new CreateAsset(driver);
        CreateAsset.createAssetMethod();
    }
}
