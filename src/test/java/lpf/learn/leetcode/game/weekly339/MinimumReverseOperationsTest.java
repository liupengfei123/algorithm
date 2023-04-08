package lpf.learn.leetcode.game.weekly339;

import org.junit.Assert;
import org.junit.Test;

public class MinimumReverseOperationsTest {
    @Test
    public void test1() {
        MinimumReverseOperations test = new MinimumReverseOperations();
        Assert.assertArrayEquals(new int[]{0, -1, -1, 1}, test.minReverseOperations(4, 0, new int[]{1, 2}, 4));
    }

    @Test
    public void test2() {
        MinimumReverseOperations test = new MinimumReverseOperations();
        Assert.assertArrayEquals(new int[]{0, -1, -1, -1, -1}, test.minReverseOperations(5, 0, new int[]{2, 4}, 3));
    }

    @Test
    public void test3() {
        MinimumReverseOperations test = new MinimumReverseOperations();
        Assert.assertArrayEquals(new int[]{-1, -1, 0, -1}, test.minReverseOperations(4, 2, new int[]{0, 1, 3}, 1));
    }

    @Test
    public void test4() {
        MinimumReverseOperations test = new MinimumReverseOperations();
        Assert.assertArrayEquals(new int[]{-1, -1, 0, -1}, test.minReverseOperations(4, 2, new int[]{1, 3}, 1));
    }

    @Test
    public void test5() {
        MinimumReverseOperations test = new MinimumReverseOperations();
        Assert.assertArrayEquals(new int[]{0, -1, -1, 1}, test.minReverseOperations(4, 0, new int[]{}, 4));
    }
}
