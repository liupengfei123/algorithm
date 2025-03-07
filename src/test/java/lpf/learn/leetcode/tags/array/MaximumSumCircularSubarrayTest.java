package lpf.learn.leetcode.tags.array;

import lpf.learn.leetcode.tags.dp.MaximumSumCircularSubarray;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaximumSumCircularSubarrayTest {

    @Test
    public void test1(){
        MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();
        Assert.assertEquals(3, test.maxSubarraySumCircular(new int[]{1,-2,3,-2}));
    }

    @Test
    public void test2(){
        MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();
        Assert.assertEquals(10, test.maxSubarraySumCircular(new int[]{5,-3,5}));
    }

    @Test
    public void test3(){
        MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();
        Assert.assertEquals(3, test.maxSubarraySumCircular(new int[]{3,-2,2,-3}));
    }

    @Test
    public void test4(){
        MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();
        Assert.assertEquals(10, test.maxSubarraySumCircular(new int[]{3,2,2,3}));
    }

    @Test
    public void test5(){
        MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();
        Assert.assertEquals(-2, test.maxSubarraySumCircular(new int[]{-3,-2,-3}));
    }
}
