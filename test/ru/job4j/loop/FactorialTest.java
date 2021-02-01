package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int exp = 120;
        int rsl = Factorial.calc(5);
        assertThat(rsl, Matchers.is(exp));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int exp = 1;
        int rsl = Factorial.calc(0);
        assertThat(rsl, Matchers.is(exp));
    }
}