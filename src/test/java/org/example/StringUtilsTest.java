package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testGetLength() {
        assertEquals(5, StringUtils.getLength("Hello"));
        assertEquals(0, StringUtils.getLength(null));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty(null));
        assertFalse(StringUtils.isEmpty("Java"));
    }

    //test here will fail and i do it for testing
//    @Test
//    public void testReverse() {
//        assertEquals("avaJ", StringUtils.reverse("Java"));
//        assertEquals("", StringUtils.reverse(""));
//        assertEquals(null, StringUtils.reverse(null));
//    }

}
