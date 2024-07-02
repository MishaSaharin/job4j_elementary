package ru.job4j.calculator;

import static ru.job4j.calculator.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double total(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + divide(first, second)
                + subtract(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivide(20, 10));
        System.out.println("Результат расчета равен: " + total(20, 10));
    }
}