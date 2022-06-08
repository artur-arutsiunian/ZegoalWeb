package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.CustomReport;
import org.junit.Test;

public class CustomReportTest extends CoreTestCase {

    @Test
    public void testCustomReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        CustomReport CustomReport = new CustomReport(driver);
        CustomReport.customReportMethod();
    }
}
