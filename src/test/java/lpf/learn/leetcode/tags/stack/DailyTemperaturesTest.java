package lpf.learn.leetcode.tags.stack;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void test1() {
        DailyTemperatures temp = new DailyTemperatures();
        Assert.assertArrayEquals(new int[]{1, 1, 0}, temp.dailyTemperatures(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        DailyTemperatures temp = new DailyTemperatures();
        Assert.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, temp.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    public void test3() {
        DailyTemperatures temp = new DailyTemperatures();
        Assert.assertArrayEquals(new int[]{1, 1, 0}, temp.dailyTemperatures(new int[]{30,60,90}));
    }

}
