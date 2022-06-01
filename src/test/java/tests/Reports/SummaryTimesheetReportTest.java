package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.SummaryTimesheetReport;
import org.junit.Test;

public class SummaryTimesheetReportTest extends CoreTestCase {

    @Test
    public void testSummaryTimesheetReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        SummaryTimesheetReport SummaryTimesheetReport = new SummaryTimesheetReport(driver);
        SummaryTimesheetReport.summaryTimesheetReportMethod();
    }
}
