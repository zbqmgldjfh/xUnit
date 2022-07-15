import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestCase implements Test{
    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult testResult) {
        testResult.testStarted();
        setUp();
        runTestCase(testResult);
        tearDown();
    }

    public void setUp() {}

    private void runTestCase(TestResult testResult) {
        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            testResult.testFailed();
        }
    }

    public void tearDown() {}
}
