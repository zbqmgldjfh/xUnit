public class XUnitTest {

    public static void main(String[] args) {
        System.out.println(new TestCaseTest("testTemplateMethod").run().getSummary());
        System.out.println(new TestCaseTest("testResult").run().getSummary());
        System.out.println(new TestCaseTest("testFailedResultFormatting").run().getSummary());
        System.out.println(new TestCaseTest("testFailedResult").run().getSummary());
    }
}
