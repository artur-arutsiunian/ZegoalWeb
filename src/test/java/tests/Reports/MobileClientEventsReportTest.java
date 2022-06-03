package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.MobileClientEventsReport;
import org.junit.Test;

public class MobileClientEventsReportTest extends CoreTestCase {

    @Test
    public void testMobileClientEventsReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MobileClientEventsReport MobileClientEventsReport = new MobileClientEventsReport(driver);
        MobileClientEventsReport.mobileClientEventsReportMethod();
    }
}
