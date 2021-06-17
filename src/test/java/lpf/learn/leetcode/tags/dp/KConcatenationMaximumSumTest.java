package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class KConcatenationMaximumSumTest {
    @Test
    public void test1(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(10, test.kConcatenationMaxSum(new int[]{1, 2, 3, 4}, 1));
    }

    @Test
    public void test2(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(30, test.kConcatenationMaxSum(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    public void test3(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(2, test.kConcatenationMaxSum(new int[]{1,-2,1}, 5));
    }

    @Test
    public void test4(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(1, test.kConcatenationMaxSum(new int[]{1,-2,1}, 1));
    }

    @Test
    public void test5(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(0, test.kConcatenationMaxSum(new int[]{-1,-2}, 7));
    }

    @Test
    public void test6(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(21, test.kConcatenationMaxSum(new int[]{1,2,-1,4,-2,3}, 3));
    }

    @Test
    public void test7(){
        KConcatenationMaximumSum test = new KConcatenationMaximumSum();
        Assert.assertEquals(20, test.kConcatenationMaxSum(new int[]{-5,-2,0,0,3,9,-2,-5,4}, 5));
    }

}
