package tests.CRM.asset;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.assets.DeleteAsset;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class DeleteAssetTest extends CoreTestCase {

    @Test
    public void testDeleteAsset() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DeleteAsset DeleteAsset = new DeleteAsset(driver);
        DeleteAsset.deleteAssetMethod();
    }
}
