package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.TracksReport;
import org.junit.Test;

public class TracksReportTest extends CoreTestCase {

    @Test
    public void testTracksReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        TracksReport TracksReport = new TracksReport(driver);
        TracksReport.tracksReportMethod();
    }
}
