package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.VisitingReport;
import org.junit.Test;

public class VisitingReportTest extends CoreTestCase {

    @Test
    public void testVisitingReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        VisitingReport VisitingReport = new VisitingReport(driver);
        VisitingReport.visitingReportMethod();
    }
}
