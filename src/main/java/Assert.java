import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assert {

    private static final Logger logger = LoggerFactory.getLogger(Assert.class);

    public static void assertEquals(Object actual, Object expected) {
        if(!actual.equals(expected)) {
            logger.info("Test Failed : expected <" + expected + "> but was <" + actual + ">");
            throw new AssertionError("expected <" + expected + "> but was <" + actual + ">");
        }
        logger.info("Test Passed");
    }
}
