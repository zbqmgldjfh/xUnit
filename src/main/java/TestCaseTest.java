import annotation.Test;

public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    public static TestSuite suite() {
        return new TestSuite(TestCaseTest.class);
    }

    @Test
    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        TestResult testResult = new TestResult();
        test.run(testResult);
        Assert.assertEquals(test.log, "setUp testMethod tearDown");
    }

    @Test
    public void testResult() {
        WasRun test = new WasRun("testMethod");
        TestResult testResult = new TestResult();
        test.run(testResult);
        Assert.assertEquals(testResult.getSummary(), "1 run, 0 failed");
    }

    @Test
    public void testFailedResultFormatting() {
        TestResult testResult = new TestResult();
        testResult.testStarted();
        testResult.testFailed();
        Assert.assertEquals(testResult.getSummary(), "1 run, 1 failed");
    }

    @Test
    public void testFailedResult() {
        WasRun test = new WasRun("testFailedMethod");
        TestResult testResult = new TestResult();
        test.run(testResult);
        Assert.assertEquals(testResult.getSummary(), "1 run, 1 failed");
    }

    @Test
    public void testSuite() {
        TestSuite testSuite = new TestSuite();
        testSuite.add(new WasRun("testMethod"));
        testSuite.add(new WasRun("testFailedMethod"));
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        Assert.assertEquals(testResult.getSummary(), "2 run, 1 failed");
    }
}
