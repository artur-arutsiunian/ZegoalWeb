package tests.Reports;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import lib.CoreTestCase;
import lib.ui.LoginPageObject.Login;
import lib.ui.ReportsPageObject.TaskReport;
import org.junit.Test;

@Epic("Test for Task report")
public class TaskReportTest extends CoreTestCase {

    @Test
    @Features(value = {@Feature(value = "Work of report overall")})
    public void testTaskReport() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        TaskReport TaskReport = new TaskReport(driver);
        TaskReport.taskReportMethod();
    }
}
