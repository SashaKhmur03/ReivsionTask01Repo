package by.itstep.sasha.task01.controller;


import by.itstep.sasha.task01.model.*;
import by.itstep.sasha.task01.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.print("Input number, number of coins(k) and seeker(n): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int number = scanner.nextInt();

        Printer.print("Number of coin for each other are: "
                + Task01.distributeGoldCoins(n, k));
        Printer.print("\n" + "Coins for charity: "
                + Task02.distributeGoldCoinsForCharity(n, k));
        Printer.print("\n" + "Tens number: "
                + Task03.getTensNumber(number));
        Printer.print("\n" + "Hundred number: "
                + Task04.getHundredNumber(number));
        Printer.print("\n" + "Next even number is : "
                + Task05.getNextEvenNumber(number));
        Printer.print("\n" + "Unequal Treasure Seekers : "
                + TaskX.getUnequalTreasureSeekers(n, k));
    }
}
