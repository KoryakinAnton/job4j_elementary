package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        boolean max = first > second;
        return max ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int rsl = Max.max(6, 1);
        System.out.println(rsl);
    }
}
