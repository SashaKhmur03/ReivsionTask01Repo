package by.itstep.sasha.task01.model;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task03Test {

    @Test
    public void testWithSingleDigitNumber() {
        assertEquals(0, Task03.getTensNumber(4));
    }

    @Test
    public void testWithTwoDigitNumber() {
        assertEquals(2, Task03.getTensNumber(24));
    }

    @Test
    public void testWithThreeDigitNumber() {
        assertEquals(2, Task03.getTensNumber(124));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(0, Task03.getTensNumber(-4));
        assertEquals(1, Task03.getTensNumber(-11));
        assertEquals(1, Task03.getTensNumber(-12));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, Task03.getTensNumber(0));
    }

    @Test
    public void testBoundaryNumber() {
        assertEquals(0, Task03.getTensNumber(1));
        assertEquals(0, Task03.getTensNumber(9));
        assertEquals(9, Task03.getTensNumber(99));
        assertEquals(1, Task03.getTensNumber(10));
        assertEquals(0, Task03.getTensNumber(100));
    }
}
