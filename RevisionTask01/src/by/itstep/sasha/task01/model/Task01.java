package by.itstep.sasha.task01.model;

public class Task01 {
    public static int distributeGoldCoins(int seeker, int coin) {
            if (seeker <= 0 || coin <= 0) {
                return -1;
            }

        return coin / seeker;
    }
}