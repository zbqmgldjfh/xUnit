public class TestCaseTest extends TestCase{

    private WasRun test;

    public TestCaseTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        test = new WasRun("testMethod");
    }

    public void testRunning() {
        Assert.assertEquals(test.wasRun, false);
        test.run();
        Assert.assertEquals(test.wasRun, true);
    }

    public void testSetUp() {
        Assert.assertEquals(test.wasSetUp, false);
        test.run();
        Assert.assertEquals(test.wasSetUp, true);
    }
}
