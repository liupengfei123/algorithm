package lpf.learn.leetcode.game.weekly293;

import org.junit.Assert;
import org.junit.Test;

public class LargestCombinationWithBitwiseAndGreaterThanZeroTest {
    @Test
    public void test1() {
        LargestCombinationWithBitwiseAndGreaterThanZero test = new LargestCombinationWithBitwiseAndGreaterThanZero();

        Assert.assertEquals(4, test.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
    }

    @Test
    public void test2() {
        LargestCombinationWithBitwiseAndGreaterThanZero test = new LargestCombinationWithBitwiseAndGreaterThanZero();

        Assert.assertEquals(2, test.largestCombination(new int[]{8, 8}));
    }
}