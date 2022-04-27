package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.Epic.CreateEpicTest;
import tests.Epic.DeleteEpicTest;
import tests.Task.*;
import tests.staff.CreateUserTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CreateEpicTest.class,
        DeleteEpicTest.class,
        CreateTaskTest.class,
        AddLabelTest.class,
        AddRemarkTest.class,
        CancelRemarkTest.class,
        AddCommentTest.class,
        CancelCommentTest.class,
        DeleteTaskTest.class,
        EditTaskTest.class,
        FilterTest.class,
        CreateUserTest.class
})

public class TestSuite {}
