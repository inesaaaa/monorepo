import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testMultiply() {
        assertEquals(15, Main.multiply(3, 5));
    }
}
