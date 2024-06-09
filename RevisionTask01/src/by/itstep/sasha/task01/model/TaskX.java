package by.itstep.sasha.task01.model;

public class TaskX {
    public static int getUnequalTreasureSeekers(int seeker, int coin) {
        if (seeker <= 0 || coin <= 0 || coin < seeker) {
            return -1;
        }        //  Check input constraints


        int maxCoinsPerSeeker = coin / seeker; // Calculate the maximum number of coins per seeker


        if (coin % seeker > 0) {
            maxCoinsPerSeeker++;   // Adjust the maximum number of coins if there are remaining coins
        }

        int minCoinsPerSeeker = maxCoinsPerSeeker - 1; //  Calculate the minimum number of coins per seeker


        return coin % seeker; //  Calculate the number of seekers with fewer coins
    }
}