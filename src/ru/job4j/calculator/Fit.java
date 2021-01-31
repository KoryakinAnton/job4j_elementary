package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short mHeight = 187;
        short wHeight = 178;
        double man = Fit.manWeight(mHeight);
        double woman = Fit.womanWeight(wHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 178 is " + woman);
    }
}
