public class TestCaseTest extends TestCase{
    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        WasRun test = new WasRun("testMethod");
        System.out.println("test.wasRun() = " + test.wasRun);
        test.run();
        System.out.println("test.wasRun() = " + test.wasRun);
    }
}
