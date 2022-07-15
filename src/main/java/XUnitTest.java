public class XUnitTest {

    public static void main(String[] args) {
        TestSuite testSuite = TestCaseTest.suite();
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        System.out.println("[TEST RESULT] = " + testResult.getSummary());
    }
}
