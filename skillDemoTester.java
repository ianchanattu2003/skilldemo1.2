import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTester {

    @Test
    public void testExponent() {
        skillDemoAttempt s1 = new skillDemoAttempt();
        assertEquals(s1.exponent_squared(3), 9);
    }

}
