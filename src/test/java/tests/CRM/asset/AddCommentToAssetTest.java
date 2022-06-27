package tests.CRM.asset;

import lib.CoreTestCase;
import lib.ui.CRMPageObject.assets.AddCommentToAsset;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class AddCommentToAssetTest extends CoreTestCase {

    @Test
    public void testAddCommentToAssetTest() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        AddCommentToAsset AddCommentToAsset = new AddCommentToAsset(driver);
        AddCommentToAsset.addCommentToAssetMethod();
    }
}
