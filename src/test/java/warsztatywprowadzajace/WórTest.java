package warsztatywprowadzajace;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertSame;
import static org.testng.AssertJUnit.assertEquals;

public class WórTest {

    @Test
    private void testKlasyWór() {
        List<String> strings = Arrays.asList("a", "b", "c");
        Wór<String, Integer> b = new Wór<>("pierwszy", 2, strings);
        assertEquals(b.getT(), "pierwszy");
        assertEquals((int) b.getS(), 2);
        assertSame(strings, b.getStrings());
    }

    @Test
    private void testKlasyWór2() {
        List<String> strings = Arrays.asList("a", "b", "c");
        Wór<Float, Thread> b = new Wór<>(0.0f, Thread.currentThread(), strings);
        assertEquals(b.getT(), 0.0f, 0.0);
        assertSame(b.getS(), Thread.currentThread());
        assertSame(strings, b.getStrings());
    }
}