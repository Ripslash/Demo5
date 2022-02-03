import static org.junit.Assert.*;
import org.junit.*;

@Test
public abstract class killtester {
    public void test() {
        assertEquals((int) (killdemo.killme()), 1);
    }
}
