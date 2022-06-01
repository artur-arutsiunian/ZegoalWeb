package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.SummaryMovementsReport;
import org.junit.Test;

public class SummaryMovementsReportTest extends CoreTestCase {

    @Test
    public void testSummaryMovementsReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        SummaryMovementsReport SummaryMovementsReport = new SummaryMovementsReport(driver);
        SummaryMovementsReport.summaryMovementReportMethod();
    }
}
