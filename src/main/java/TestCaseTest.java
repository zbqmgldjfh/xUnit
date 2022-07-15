public class TestCaseTest extends TestCase{

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run();
        Assert.assertEquals(test.log, "setUp testMethod tearDown");
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        TestResult testResult = test.run();
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
        TestResult testResult = test.run();
        Assert.assertEquals(testResult.getSummary(), "1 run, 1 failed");
    }
}
