package by.itstep.sasha.task01.model;

public class Task04 {
    public static int getHundredNumber(int number) {
        number = Math.abs(number);

        if (number < 100) {
            return 0;
        }

        return (number / 100) % 10;
    }
}