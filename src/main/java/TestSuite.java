import java.util.ArrayList;
import java.util.List;

public class TestSuite {

    private List<TestCase> tests = new ArrayList<>();

    public void add(TestCase test) {
        tests.add(test);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> t.run(testResult));
    }
}
