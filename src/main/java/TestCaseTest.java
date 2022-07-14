public class TestCaseTest extends TestCase{
    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        WasRun test = new WasRun("testMethod");
        Assert.assertEquals(test.wasRun, false);
        test.run();
        Assert.assertEquals(test.wasRun, false);
    }
}
