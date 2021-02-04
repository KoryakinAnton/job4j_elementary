package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax10To2To23Then10() {
        int result = Max.max(10, 2, 23);
        assertThat(result, is(23));
    }

    @Test
    public void whenMax1To1To1To1Then1() {
        int result = Max.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}