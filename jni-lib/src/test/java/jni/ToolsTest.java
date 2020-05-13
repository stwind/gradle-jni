package jni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibTest {
    @Test
    void testFoo() {
        Tools tools = new Tools();
        assertEquals(tools.foo(), "foo");
        assertEquals(tools.bar(), "bar");
    }
}