package by.itstep.sasha.task01.model;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskXTest {

    @Test
    public void testWhereMoreCoinThanSeekerWithoutRemainder() {
        assertEquals(0, TaskX.getUnequalTreasureSeekers(4, 20));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithOneRemainder() {
        assertEquals(1, TaskX.getUnequalTreasureSeekers(5, 6));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithTwoRemainder() {
        assertEquals(2, TaskX.getUnequalTreasureSeekers(5, 7));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithThreeRemainder() {
        assertEquals(3, TaskX.getUnequalTreasureSeekers(5, 8));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithFourRemainder() {
        assertEquals(4, TaskX.getUnequalTreasureSeekers(5, 9));
    }

    @Test
    public void testWhereOnlyOneCoinLeft() {
        assertEquals(-1, TaskX.getUnequalTreasureSeekers(5, 1));
    }

    @Test
    public void testWhereMoreSeekerThanCoin() {
        assertEquals(-1, TaskX.getUnequalTreasureSeekers(16, 5));
    }

    @Test
    public void testTheSameSeekerAndCoin() {
        assertEquals(0, TaskX.getUnequalTreasureSeekers(10, 10));
    }

    @Test
    public void testOnlyOneSeekerAndOnlyOneCoin() {
        assertEquals(0, TaskX.getUnequalTreasureSeekers(1, 1));
    }

    @Test
    public void testNegativeSeeker() {
        assertEquals(-1, TaskX.getUnequalTreasureSeekers(-3, 1));
    }

    @Test
    public void testNegativeCoin() {
        assertEquals(-1, TaskX.getUnequalTreasureSeekers(3, -1));
    }

    @Test
    public void testZeroSeeker() {
        assertEquals(-1, TaskX.getUnequalTreasureSeekers(0, 10));
    }

    @Test
    public void testZeroCoin() {
        assertEquals(-1, TaskX.getUnequalTreasureSeekers(2, 0));
    }
}
