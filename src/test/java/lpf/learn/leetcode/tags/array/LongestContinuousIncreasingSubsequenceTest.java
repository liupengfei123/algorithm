package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void test1(){
        LongestContinuousIncreasingSubsequence test = new LongestContinuousIncreasingSubsequence();
        Assert.assertEquals(2, test.findLengthOfLCIS(new int[]{1, 0, 0, 0, 1}));
    }

    @Test
    public void test2(){
        LongestContinuousIncreasingSubsequence test = new LongestContinuousIncreasingSubsequence();
        Assert.assertEquals(1, test.findLengthOfLCIS(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void test3(){
        LongestContinuousIncreasingSubsequence test = new LongestContinuousIncreasingSubsequence();
        Assert.assertEquals(3, test.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void test4(){
        LongestContinuousIncreasingSubsequence test = new LongestContinuousIncreasingSubsequence();
        Assert.assertEquals(5, test.findLengthOfLCIS(new int[]{1,3,5,6,7}));
    }

    @Test
    public void test5(){
        LongestContinuousIncreasingSubsequence test = new LongestContinuousIncreasingSubsequence();
        Assert.assertEquals(0, test.findLengthOfLCIS(new int[]{}));
    }
}
