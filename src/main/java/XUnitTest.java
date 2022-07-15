public class XUnitTest {

    public static void main(String[] args) {
        TestSuite testSuite = TestCaseTest.suite();
        TestResult testResult = new TestResult();
        testSuite.run(testResult);

        TestSuite testSuiteCollection = new TestSuite();
        testSuiteCollection.add(new TestCaseTest("testTemplateMethod"));
        testSuiteCollection.add(testSuite);
        TestResult testResult2 = new TestResult();
        testSuiteCollection.run(testResult2);
        System.out.println("[TEST RESULT] = " + testResult2.getSummary());
    }
}
