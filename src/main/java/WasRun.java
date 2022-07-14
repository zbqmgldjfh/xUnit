public class WasRun extends TestCase {

    public boolean wasRun;
    public boolean wasSetUp;

    @Override
    public void setUp() {
        wasSetUp = true;
    }

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        this.wasRun = true;
    }

}
