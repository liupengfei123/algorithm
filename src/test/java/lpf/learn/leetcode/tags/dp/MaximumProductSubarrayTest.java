package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarrayTest {
    @Test
    public void test1(){
        MaximumProductSubarray test = new MaximumProductSubarray();
        Assert.assertEquals(6, test.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    public void test2(){
        MaximumProductSubarray test = new MaximumProductSubarray();
        Assert.assertEquals(0, test.maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    public void test3(){
        MaximumProductSubarray test = new MaximumProductSubarray();
        Assert.assertEquals(9, test.maxProduct(new int[]{-2,0,-1,-9}));
    }

    @Test
    public void test4(){
        MaximumProductSubarray test = new MaximumProductSubarray();
        Assert.assertEquals(2520, test.maxProduct(new int[]{1,2,4,5,6,0,-1,-9,-8,7,-5}));
    }

    @Test
    public void test5(){
        MaximumProductSubarray test = new MaximumProductSubarray();
        Assert.assertEquals(-5, test.maxProduct(new int[]{-5}));
    }
}
