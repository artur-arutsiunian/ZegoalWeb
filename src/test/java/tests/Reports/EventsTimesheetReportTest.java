package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.EventsTimesheetReport;
import org.junit.Test;

public class EventsTimesheetReportTest extends CoreTestCase {

    @Test
    public void testEventsTimeSheetReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        EventsTimesheetReport EventsTimesheetReport = new EventsTimesheetReport(driver);
        EventsTimesheetReport.eventsTimesheetReportMethod();
    }
}
