package tests.Reports;

import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.MovementReport;
import org.junit.Test;

public class MovementsReportTest extends CoreTestCase {

    @Test
    public void testMovementsReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        MovementReport MovementReport = new MovementReport(driver);
        MovementReport.movementsReportMethod();
    }
}
