import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test{

    private List<Test> tests = new ArrayList<>();

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult testResult) {
        tests.forEach(t -> t.run(testResult));
    }
}
