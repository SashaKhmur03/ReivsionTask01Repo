package by.itstep.sasha.task01.model;

public class Task05 {
    public static int getNextEvenNumber(int number) {
        if (number < 0) {
            return 0; // Return 0 for negative numbers
        }

        return (number % 2 == 0) ? number + 2 : number + 1;
    }
}