package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.PeriodTimesheetReport;
import org.junit.Test;

public class PeriodTimesheetReportTest extends CoreTestCase {

    @Test
    public void testPeriodTimesheetReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        PeriodTimesheetReport PeriodTimesheetReport = new PeriodTimesheetReport(driver);
        PeriodTimesheetReport.periodTimesheetReportMethod();
    }
}