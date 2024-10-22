package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAbsoluteSumOfAnySubarrayTest {
    @Test
    public void test1() {
        MaximumAbsoluteSumOfAnySubarray test = new MaximumAbsoluteSumOfAnySubarray();
        Assert.assertEquals(5, test.maxAbsoluteSum(new int[]{1,-3,2,3,-4}));
    }

    @Test
    public void test2() {
        MaximumAbsoluteSumOfAnySubarray test = new MaximumAbsoluteSumOfAnySubarray();
        Assert.assertEquals(8, test.maxAbsoluteSum(new int[]{2,-5,1,-4,3,-2}));
    }

    @Test
    public void test3() {
        MaximumAbsoluteSumOfAnySubarray test = new MaximumAbsoluteSumOfAnySubarray();
        Assert.assertEquals(27, test.maxAbsoluteSum(new int[]{-3,-5,-3,-2,-6,3,10,-10,-8,-3,0,10,3,-5,8,7,-9,-9,5,-8}));
    }
}
