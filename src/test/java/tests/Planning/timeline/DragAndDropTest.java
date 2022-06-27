package tests.Planning.timeline;

import lib.CoreTestCase;
import lib.ui.PlanningPageObject.timeline.DragAndDropTaskToTable;
import lib.ui.LoginPageObject.Login;
import org.junit.Test;

public class DragAndDropTest extends CoreTestCase {

    @Test
    public void testDragAndDrop() throws InterruptedException {
        Login Login = new Login(driver);
        Login.loginMethod();

        DragAndDropTaskToTable DragAndDropTaskToTable = new DragAndDropTaskToTable(driver);
        DragAndDropTaskToTable.dragAndDropTaskToTableMethod();
    }
}
