package by.itstep.sasha.task01.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task05Test {

    @Test
    public void testPositiveEvenNumber() {
        assertEquals(4, Task05.getNextEvenNumber(2));
        assertEquals(10, Task05.getNextEvenNumber(8));
        assertEquals(12, Task05.getNextEvenNumber(10));
    }

    @Test
    public void testPositiveOddNumber() {
        assertEquals(4, Task05.getNextEvenNumber(3));
        assertEquals(10, Task05.getNextEvenNumber(9));
        assertEquals(12, Task05.getNextEvenNumber(11));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, Task05.getNextEvenNumber(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(0, Task05.getNextEvenNumber(-5));
    }

    @Test
    public void testBoundaryNumber() {
        assertEquals(2, Task05.getNextEvenNumber(1));
    }
}
