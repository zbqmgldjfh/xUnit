public class WasRun extends TestCase {

    public boolean wasRun;

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        this.wasRun = true;
    }

}
