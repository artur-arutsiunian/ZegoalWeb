package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.CRM.companies.*;
import tests.CRM.locations.CreateLocationTest;
import tests.Epic.CreateEpicTest;
import tests.Epic.DeleteEpicTest;
import tests.Maps.ChooseUserTest;
import tests.Maps.FilterOnMapTest;
import tests.Maps.ViewTaskTest;
import tests.Reports.*;
import tests.Staff.*;
import tests.Task.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
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
        CreateUserTest.class,
        DeactivateUserTest.class,
        ActivateUserTest.class,
        EditUserTest.class,
        SearchUserTest.class
})

public class TestSuite {}
