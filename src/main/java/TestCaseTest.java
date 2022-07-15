public class TestCaseTest extends TestCase{

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        TestResult testResult = new TestResult();
        test.run(testResult);
        Assert.assertEquals(test.log, "setUp testMethod tearDown");
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        TestResult testResult = new TestResult();
        test.run(testResult);
        Assert.assertEquals(testResult.getSummary(), "1 run, 0 failed");
    }

    public void testFailedResultFormatting() {
        TestResult testResult = new TestResult();
        testResult.testStarted();
        testResult.testFailed();
        Assert.assertEquals(testResult.getSummary(), "1 run, 1 failed");
    }

    public void testFailedResult() {
        WasRun test = new WasRun("testFailedMethod");
        TestResult testResult = new TestResult();
        test.run(testResult);
        Assert.assertEquals(testResult.getSummary(), "1 run, 1 failed");
    }

    public void testSuite() {
        TestSuite testSuite = new TestSuite();
        testSuite.add(new WasRun("testMethod"));
        testSuite.add(new WasRun("testFailedMethod"));
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        Assert.assertEquals(testResult.getSummary(), "2 run, 1 failed");
    }
}
