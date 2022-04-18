package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.Epic.EpicTest;
import tests.Task.AdditionalFilterTest;
import tests.Task.FilterAssigneeTest;
import tests.Task.TaskTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        EpicTest.class,
        AdditionalFilterTest.class,
        FilterAssigneeTest.class,
        TaskTest.class
})

public class TestSuite {}
