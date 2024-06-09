package by.itstep.sasha.task01.model;

public class Task02 {
    public static int distributeGoldCoinsForCharity(int seeker, int coin) {
        if (seeker <= 0 || coin <= 0) {
            return -1;
        }

        return coin % seeker;
    }
}