package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float expectedForEuro = 2;
        float output = Converter.rubleToEuro(inputEuro);
        boolean passed = expectedForEuro == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inputDollar = 120;
        float expectedForDollar = 2;
        output = Converter.rubleToDollar(inputDollar);
        passed = expectedForDollar == output;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}