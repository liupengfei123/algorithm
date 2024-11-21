package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySumTest {
    @Test
    public void test1() {
        MinimumSizeSubarraySum test = new MinimumSizeSubarraySum();
        Assert.assertEquals(2, test.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void test2() {
        MinimumSizeSubarraySum test = new MinimumSizeSubarraySum();
        Assert.assertEquals(1, test.minSubArrayLen(4, new int[]{1,4,4}));
    }

    @Test
    public void test3() {
        MinimumSizeSubarraySum test = new MinimumSizeSubarraySum();
        Assert.assertEquals(0, test.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }

    @Test
    public void test4() {
        MinimumSizeSubarraySum test = new MinimumSizeSubarraySum();
        Assert.assertEquals(0, test.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}
