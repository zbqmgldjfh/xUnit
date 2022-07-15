import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test{

    private List<Test> tests = new ArrayList<>();

    public TestSuite() {
    }

    public TestSuite(Class<? extends TestCase> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(m -> m.getName().startsWith("test"))
                .forEach(m ->
                        {
                            try {
                                TestCase testCase = testClass.getConstructor(String.class).newInstance(m.getName());
                                tests.add(testCase);
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                );
    }

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> t.run(testResult));
    }
}
