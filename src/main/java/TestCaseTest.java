public class TestCaseTest extends TestCase{

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run();
        Assert.assertEquals(test.log, "setUp testMethod tearDown");
    }
}
