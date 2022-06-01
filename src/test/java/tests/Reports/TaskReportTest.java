package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.TaskReport;
import org.junit.Test;

public class TaskReportTest extends CoreTestCase {

    @Test
    public void testTaskReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        TaskReport TaskReport = new TaskReport(driver);
        TaskReport.taskReportMethod();
    }
}
