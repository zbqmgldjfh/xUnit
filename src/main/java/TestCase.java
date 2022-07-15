import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestCase {
    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public TestResult run() {
        TestResult testResult = new TestResult();
        testResult.testStarted();
        setUp();
        runTestCase();
        tearDown();
        return testResult;
    }

    public void setUp() {}

    private void runTestCase() {
        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public void tearDown() {}
}
