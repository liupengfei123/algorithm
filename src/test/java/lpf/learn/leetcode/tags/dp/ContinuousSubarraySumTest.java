package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class ContinuousSubarraySumTest {
    @Test
    public void test1(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertTrue(test.checkSubarraySum(new int[]{2, 1, 3, 4}, 4));
    }

    @Test
    public void test2(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertFalse(test.checkSubarraySum(new int[]{1, 2, 3, 9}, 9));
    }

    @Test
    public void test3(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertTrue(test.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    }

    @Test
    public void test4(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertTrue(test.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
    }

    @Test
    public void test5(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertFalse(test.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 0));
    }

    @Test
    public void test6(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertFalse(test.checkSubarraySum(new int[]{}, 9));
    }

    @Test
    public void test7(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertTrue(test.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, -1));
    }

    @Test
    public void test8(){
        ContinuousSubarraySum test = new ContinuousSubarraySum();
        Assert.assertTrue(test.checkSubarraySum(new int[]{0, 0}, 0));
    }
}
