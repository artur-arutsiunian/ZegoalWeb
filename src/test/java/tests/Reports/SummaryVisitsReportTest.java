package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.SummaryVisitsReport;
import org.junit.Test;

public class SummaryVisitsReportTest extends CoreTestCase {

    @Test
    public void testSummaryVisitsReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        SummaryVisitsReport SummaryVisitsReport = new SummaryVisitsReport(driver);
        SummaryVisitsReport.summaryVisitsReportMethod();
    }
}
