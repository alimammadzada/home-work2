package app.WarmUp2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilteringTest {
    Filtering filter = new Filtering();
    @Test
    void Filtering(){
        String expected = "l";
        String actual = filter.Filtering("Ali");
        assertEquals(expected, actual);
    }
    @Test
    void Filtering2(){
        String expected = "hll";
        String actual = filter.Filtering("Hello");
        assertEquals(expected, actual);
    }
    @Test
    void Filtering3(){
        String expected = "134ww";
        String actual = filter.Filtering("134aEEwwAA");
        assertEquals(expected, actual);
    }
    @Test
    void Filtering4(){
        String expected = "**";
        String actual = filter.Filtering("*a*");
        assertEquals(expected, actual);
    }
}