package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.Epic.CreateEpicTest;
import tests.Epic.DeleteEpicTest;
import tests.Task.AddLabelTest;
import tests.Task.CreateTaskTest;
import tests.Task.EditTaskTest;
import tests.Task.FilterTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CreateEpicTest.class,
        DeleteEpicTest.class,
        CreateTaskTest.class,
        AddLabelTest.class,
        EditTaskTest.class,
        FilterTest.class
})

public class TestSuite {}
