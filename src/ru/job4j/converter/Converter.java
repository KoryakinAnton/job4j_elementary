package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int inE = 140;
        int inD = 180;
        int expectedE = 2;
        int expectedD = 3;
        int euro = Converter.rubleToEuro(inE);
        int dollar = Converter.rubleToDollar(inD);
        int outE = Converter.rubleToEuro(inE);
        boolean passedE = expectedE == outE;
        int outD = Converter.rubleToDollar(inD);
        boolean passed = expectedD == outD;
        System.out.println("140 rubles are " + euro + " euro. " + "Test result : " + passed);
        System.out.println("180 rubles are " + dollar + " dollar. " + "Test result : " + passed);
        }
}
