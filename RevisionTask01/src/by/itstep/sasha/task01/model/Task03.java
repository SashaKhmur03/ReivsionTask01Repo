package by.itstep.sasha.task01.model;

public class Task03 {
    public static int getTensNumber(int number) {
        number = Math.abs(number);

        if (number < 10) {
            return 0;
        }

        return (number / 10) % 10;
    }
}