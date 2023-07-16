package lpf.learn.leetcode.game.weekly353;

import org.junit.Assert;
import org.junit.Test;

public class LongestNonDecreasingSubarrayFromTwoArraysTest {
    @Test
    public void test1(){
        LongestNonDecreasingSubarrayFromTwoArrays test = new LongestNonDecreasingSubarrayFromTwoArrays();
        Assert.assertEquals(2, test.maxNonDecreasingLength(new int[]{2,3,1}, new int[]{1,2,1}));
    }

    @Test
    public void test2(){
        LongestNonDecreasingSubarrayFromTwoArrays test = new LongestNonDecreasingSubarrayFromTwoArrays();
        Assert.assertEquals(4, test.maxNonDecreasingLength(new int[]{1,3,2,1}, new int[]{2,2,3,4}));
    }

    @Test
    public void test3(){
        LongestNonDecreasingSubarrayFromTwoArrays test = new LongestNonDecreasingSubarrayFromTwoArrays();
        Assert.assertEquals(2, test.maxNonDecreasingLength(new int[]{1,1}, new int[]{2,2}));
    }
}
