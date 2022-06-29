package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.CRM.asset.*;
import tests.CRM.companies.*;
import tests.CRM.locations.*;
import tests.Epic.CreateEpicTest;
import tests.Epic.DeleteEpicTest;
import tests.Maps.ChooseUserTest;
import tests.Maps.FilterOnMapTest;
import tests.Maps.ViewTaskTest;
import tests.Planning.timeline.DragAndDropTest;
import tests.Reports.*;
import tests.Staff.*;
import tests.Task.*;

@RunWith(Suite.class)

@Suite.SuiteClasses(value = {
        CreateEpicTest.class,
        DeleteEpicTest.class,
        CreateTaskTest.class,
        CreateLabelTest.class,
        AddLabelTest.class,
        AddRemarkTest.class,
        CancelRemarkTest.class,
        DeleteRemarkTest.class,
        AddCommentTest.class,
        CancelCommentTest.class,
        DeleteTaskTest.class,
        EditTaskTest.class,
        FilterTest.class,
        ChooseUserTest.class,
        FilterOnMapTest.class,
        ViewTaskTest.class,
        TaskReportTest.class,
        TracksReportTest.class,
        MovementsReportTest.class,
        VisitingReportTest.class,
        SummaryMovementsReportTest.class,
        SummaryVisitsReportTest.class,
        SummaryTimesheetReportTest.class,
        PeriodTimesheetReportTest.class,
        EventsTimesheetReportTest.class,
        MobileClientEventsReportTest.class,
        CustomReportTest.class,
        CreateCompanyTest.class,
        DeleteCompanyTest.class,
        EditCompanyTest.class,
        MoveToInfoTabTest.class,
        AddCommentToCompanyTest.class,
        CreateLocationTest.class,
        DeleteLocationTest.class,
        EditLocationTest.class,
        AddCommentToLocationTest.class,
        MoveToInfoTabInLocationTest.class,
        CreateAssetTest.class,
        EditAssetTest.class,
        DeleteAssetTest.class,
        AddCommentToAssetTest.class,
        MoveToInfoTabInAssetTest.class,
        CreateUserTest.class,
        DeactivateUserTest.class,
        ActivateUserTest.class,
        EditUserTest.class,
        SearchUserTest.class,
        DragAndDropTest.class
})

public class TestSuite {}
