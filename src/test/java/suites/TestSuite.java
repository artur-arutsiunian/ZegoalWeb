package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.Epic.CreateEpicTest;
import tests.Task.AddLabelTest;
import tests.Task.CreateTaskTest;
import tests.Task.EditTaskTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CreateEpicTest.class,
        CreateTaskTest.class,
        AddLabelTest.class,
        EditTaskTest.class
})

public class TestSuite {}
