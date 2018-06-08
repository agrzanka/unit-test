import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.Solution1ATest;
import tests.Solution1BTest;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        Solution1ATest.class,
        Solution1BTest.class,

})

public class TestSuite {
}