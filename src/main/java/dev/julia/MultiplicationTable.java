package dev.julia;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 5;
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = calculateMultiplication(number, i);
            printResult(number, i, result);
        }
    }

    public static int calculateMultiplication(int a, int b) {
        return a * b;
    }

    public static void printResult(int number, int multiplier, int result) {
        System.out.println(number + " x " + multiplier + " = " + result);
    }

    public static List<String> generateMultiplicationTable(int number) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int result = calculateMultiplication(number, i);
            table.add(number + " x " + i + " = " + result);
        }
        return table;
    }
}
