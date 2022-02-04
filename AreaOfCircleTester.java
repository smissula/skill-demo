import org.junit.*;
import static org.junit.Assert.*;

public class AreaOfCircleTester {
    @Test
    public void testCalculate() {
        // checks the area of a circle with radius 7
        assertEquals("Output should match formula", Math.PI * 49, AreaOfCircle.calculate(7.0), Math.pow(10, -9));
    }
}
