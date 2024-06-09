package by.itstep.sasha.task01.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task01Test {

    @Test
    public void testWhereMoreCoinThanSeekerWithoutRemainder() {
        assertEquals(6, Task01.distributeGoldCoins(4, 24));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithRemainder() {
        assertEquals(5, Task01.distributeGoldCoins(4, 23));
    }

    @Test
    public void testWhereOnlyOneCoinLeft() {
        assertEquals(5, Task01.distributeGoldCoins(4, 21));
    }

    @Test
    public void testWhereMoreSeekerThanCoin() {
        assertEquals(0, Task01.distributeGoldCoins(16, 1));
    }

    @Test
    public void testTheSameSeekerAndCoin() {
        assertEquals(1, Task01.distributeGoldCoins(10, 10));
    }

    @Test
    public void testOnlyOneSeekerAndOnlyOneCoin() {
        assertEquals(1, Task01.distributeGoldCoins(1, 1));
    }

    @Test
    public void testNegativeSeeker() {
        assertEquals(-1, Task01.distributeGoldCoins(-3, 1));
    }

    @Test
    public void testNegativeCoin() {
        assertEquals(-1, Task01.distributeGoldCoins(3, -1));
    }

    @Test
    public void testZeroSeeker() {
        assertEquals(-1, Task01.distributeGoldCoins(0, 10));
    }

    @Test
    public void testZeroCoin() {
        assertEquals(-1, Task01.distributeGoldCoins(2, 0));
    }
}
