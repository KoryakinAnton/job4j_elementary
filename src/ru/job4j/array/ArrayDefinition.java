package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + ages.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        System.out.println(names[0]);
        names[1] = "Anton Koryakin";
        System.out.println(names[1]);
        names[2] = "Stas Korobeinikov";
        System.out.println(names[2]);
        names[3] = "Andrei Hincu";
        System.out.println(names[3]);
    }
}
