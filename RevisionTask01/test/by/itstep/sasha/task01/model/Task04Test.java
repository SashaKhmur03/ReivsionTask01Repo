package by.itstep.sasha.task01.model;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task04Test {

    @Test
    public void testWithSingleDigitNumber() {
        assertEquals(0, Task04.getHundredNumber(1));
        assertEquals(0, Task04.getHundredNumber(9));
    }

    @Test
    public void testWithTwoDigitNumber() {
        assertEquals(2, Task04.getHundredNumber(12));
        assertEquals(8, Task04.getHundredNumber(91));
    }

    @Test
    public void testWithThreeDigitNumber() {
        assertEquals(1, Task04.getHundredNumber(123));
        assertEquals(9, Task04.getHundredNumber(987));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(0, Task04.getHundredNumber(-42));
        assertEquals(1, Task04.getHundredNumber(-100));
        assertEquals(1, Task04.getHundredNumber(-123));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, Task04.getHundredNumber(0));
    }

    @Test
    public void testBoundaryNumber() {
        assertEquals(0, Task04.getHundredNumber(9));
        assertEquals(0, Task04.getHundredNumber(11));
        assertEquals(0, Task04.getHundredNumber(99));
        assertEquals(1, Task04.getHundredNumber(101));
        assertEquals(9, Task04.getHundredNumber(991));
        assertEquals(1, Task04.getHundredNumber(199));
    }
}
