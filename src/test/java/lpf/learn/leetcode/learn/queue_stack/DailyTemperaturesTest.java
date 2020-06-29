package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void test() {
        DailyTemperatures temp = new DailyTemperatures();

        Assert.assertArrayEquals(new int[]{1, 1, 0}, temp.dailyTemperatures(new int[]{1, 2, 3}));

        Assert.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, temp.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }


}
