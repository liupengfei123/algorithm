package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarraySumWithOneDeletionTest {
    @Test
    public void test1(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(10, test.maximumSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(4, test.maximumSum(new int[]{1,-2,0,3}));
    }

    @Test
    public void test3(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(3, test.maximumSum(new int[]{1,-2,-2,3}));
    }

    @Test
    public void test4(){
        MaximumSubarraySumWithOneDeletion test = new MaximumSubarraySumWithOneDeletion();
        Assert.assertEquals(-1, test.maximumSum(new int[]{-1,-1,-1,-1}));
    }

    @Test
    public void test5(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
