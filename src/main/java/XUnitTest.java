public class XUnitTest {

    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite();
        testSuite.add(new TestCaseTest("testTemplateMethod"));
        testSuite.add(new TestCaseTest("testResult"));
        testSuite.add(new TestCaseTest("testFailedResultFormatting"));
        testSuite.add(new TestCaseTest("testFailedResult"));
        testSuite.add(new TestCaseTest("testSuite"));

        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        System.out.println("[TEST RESULT] = " + testResult.getSummary());
    }
}
