package jni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LibTest {
    @Test
    void testFoo() {
        Lib lib = new Lib();
        assertEquals(lib.foo(), "foo");
    }
}