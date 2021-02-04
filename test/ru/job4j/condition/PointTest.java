package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when2d() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(4, 0.001));
    }

    @Test
    public void when3d() {
        Point a = new Point(45, 27, 3);
        Point b = new Point(7, 2, 42);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(59.916, 0.001));
    }
}