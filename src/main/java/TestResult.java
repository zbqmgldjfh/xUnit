public class TestResult {

    private int runCount = 0;
    private int failCount = 0;

    public void testStarted() {
        runCount++;
    }

    public void testFailed() {
        failCount++;
    }

    public String getSummary() {
        return runCount + " run, " + failCount + " failed";
    }
}
