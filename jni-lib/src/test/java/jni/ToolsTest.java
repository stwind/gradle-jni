package jni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToolsTest {

    @Test
    void testFooBar() {
        Tools tools = new Tools();
        assertEquals(tools.foo(), "foo");
        assertEquals(tools.bar(), "bar");
    }
}